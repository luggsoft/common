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
data class Memoized4<TParam1, TParam2, TParam3, TParam4, out TResult>(
    private val block: (TParam1, TParam2, TParam3, TParam4) -> TResult,
    private val cache: ConcurrentMap<Tuple4<TParam1, TParam2, TParam3, TParam4>, TResult> = ConcurrentHashMap()
) : (TParam1, TParam2, TParam3, TParam4) -> TResult, Map<Tuple4<TParam1, TParam2, TParam3, TParam4>, TResult> by cache
{
    /**
     * TODO
     *
     * @param missingValue
     * @return
     */
    override fun invoke(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4): TResult
    {
        val key = Tuple4(param1, param2, param3, param4)
        val provider = this.block.partial(param1, param2, param3, param4)
        return this.cache.getOrPut(key, provider)
    }
}
