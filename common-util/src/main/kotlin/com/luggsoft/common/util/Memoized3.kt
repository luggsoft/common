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
data class Memoized3<TParam1, TParam2, TParam3, out TResult>(
    private val block: (TParam1, TParam2, TParam3) -> TResult,
    private val cache: ConcurrentMap<Tuple3<TParam1, TParam2, TParam3>, TResult> = ConcurrentHashMap()
) : (TParam1, TParam2, TParam3) -> TResult, Map<Tuple3<TParam1, TParam2, TParam3>, TResult> by cache
{
    /**
     * TODO
     *
     * @param missingValue
     * @return
     */
    override fun invoke(param1: TParam1, param2: TParam2, param3: TParam3): TResult
    {
        val key = Tuple3(param1, param2, param3)
        val provider = this.block.partial(param1, param2, param3)
        return this.cache.getOrPut(key, provider)
    }
}
