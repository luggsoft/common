package com.luggsoft.common.util

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @return
 */
fun <TParam1, TResult> ((TParam1) -> TResult).memoize(): Memoized1<TParam1, TResult>
{
    return Memoized1(this)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @return
 */
fun <TParam1, TParam2, TResult> ((TParam1, TParam2) -> TResult).memoize(): Memoized2<TParam1, TParam2, TResult>
{
    return Memoized2(this)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @return
 */
fun <TParam1, TParam2, TParam3, TResult> ((TParam1, TParam2, TParam3) -> TResult).memoize(): Memoized3<TParam1, TParam2, TParam3, TResult>
{
    return Memoized3(this)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @return
 */
fun <TParam1, TParam2, TParam3, TParam4, TResult> ((TParam1, TParam2, TParam3, TParam4) -> TResult).memoize(): Memoized4<TParam1, TParam2, TParam3, TParam4, TResult>
{
    return Memoized4(this)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @return
 */
fun <TParam1, TParam2, TParam3, TParam4, TParam5, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5) -> TResult).memoize(): Memoized5<TParam1, TParam2, TParam3, TParam4, TParam5, TResult>
{
    return Memoized5(this)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @return
 */
fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).memoize(): Memoized6<TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult>
{
    return Memoized6(this)
}
