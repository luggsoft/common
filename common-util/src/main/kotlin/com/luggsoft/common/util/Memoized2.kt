package com.luggsoft.common.util

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @property block
 * @property cache
 */
data class Memoized2<TParam1, TParam2, out TResult>(
    private val block: (TParam1, TParam2) -> TResult,
    private val cache: ConcurrentMap<Tuple2<TParam1, TParam2>, TResult> = ConcurrentHashMap()
) : (TParam1, TParam2) -> TResult, Map<Tuple2<TParam1, TParam2>, TResult> by cache
{
    /**
     * TODO
     *
     * @param missingValue
     * @return
     */
    override fun invoke(param1: TParam1, param2: TParam2): TResult
    {
        val key = Tuple2(param1, param2)
        val provider = this.block.partial(param1, param2)
        return this.cache.getOrPut(key, provider)
    }
}
