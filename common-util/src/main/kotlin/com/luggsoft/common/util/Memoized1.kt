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
data class Memoized1<TParam1, out TResult>(
    private val block: (TParam1) -> TResult,
    private val cache: ConcurrentMap<Tuple1<TParam1>, TResult> = ConcurrentHashMap()
) : (TParam1) -> TResult, Map<Tuple1<TParam1>, TResult> by cache
{
    /**
     * TODO
     *
     * @param missingValue
     * @return
     */
    override fun invoke(param1: TParam1): TResult
    {
        val key = Tuple1(param1)
        val provider = this.block.partial(param1)
        return this.cache.getOrPut(key, provider)
    }
}
