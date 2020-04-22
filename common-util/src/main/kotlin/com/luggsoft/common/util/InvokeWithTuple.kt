package com.luggsoft.common.util

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @param tuplex
 * @return
 */
fun <TParam1, TResult> ((TParam1) -> TResult).invokeWithTuple(tuple1: Tuple1<TParam1>): TResult
{
    return this.invoke(tuple1.param1)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @param tuplex
 * @return
 */
fun <TParam1, TParam2, TResult> ((TParam1, TParam2) -> TResult).invokeWithTuple(tuple2: Tuple2<TParam1, TParam2>): TResult
{
    return this.invoke(tuple2.param1, tuple2.param2)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @param tuplex
 * @return
 */
fun <TParam1, TParam2, TParam3, TResult> ((TParam1, TParam2, TParam3) -> TResult).invokeWithTuple(tuple3: Tuple3<TParam1, TParam2, TParam3>): TResult
{
    return this.invoke(tuple3.param1, tuple3.param2, tuple3.param3)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @param tuplex
 * @return
 */
fun <TParam1, TParam2, TParam3, TParam4, TResult> ((TParam1, TParam2, TParam3, TParam4) -> TResult).invokeWithTuple(tuple4: Tuple4<TParam1, TParam2, TParam3, TParam4>): TResult
{
    return this.invoke(tuple4.param1, tuple4.param2, tuple4.param3, tuple4.param4)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @param tuplex
 * @return
 */
fun <TParam1, TParam2, TParam3, TParam4, TParam5, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5) -> TResult).invokeWithTuple(tuple5: Tuple5<TParam1, TParam2, TParam3, TParam4, TParam5>): TResult
{
    return this.invoke(tuple5.param1, tuple5.param2, tuple5.param3, tuple5.param4, tuple5.param5)
}

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @param tuplex
 * @return
 */
fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).invokeWithTuple(tuple6: Tuple6<TParam1, TParam2, TParam3, TParam4, TParam5, TParam6>): TResult
{
    return this.invoke(tuple6.param1, tuple6.param2, tuple6.param3, tuple6.param4, tuple6.param5, tuple6.param6)
}
