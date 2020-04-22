package com.luggsoft.common.util

fun <TParam1, TResult> ((TParam1) -> TResult).partial(param1: TParam1): () -> TResult
{
    return { this.invoke(param1) }
}

fun <TParam1, TParam2, TResult> ((TParam1, TParam2) -> TResult).partial(param1: TParam1): (TParam2) -> TResult
{
    return { param2: TParam2 -> this.invoke(param1, param2) }
}

fun <TParam1, TParam2, TResult> ((TParam1, TParam2) -> TResult).partial(param1: TParam1, param2: TParam2): () -> TResult
{
    return { this.invoke(param1, param2) }
}

fun <TParam1, TParam2, TParam3, TResult> ((TParam1, TParam2, TParam3) -> TResult).partial(param1: TParam1): (TParam2, TParam3) -> TResult
{
    return { param2: TParam2, param3: TParam3 -> this.invoke(param1, param2, param3) }
}

fun <TParam1, TParam2, TParam3, TResult> ((TParam1, TParam2, TParam3) -> TResult).partial(param1: TParam1, param2: TParam2): (TParam3) -> TResult
{
    return { param3: TParam3 -> this.invoke(param1, param2, param3) }
}

fun <TParam1, TParam2, TParam3, TResult> ((TParam1, TParam2, TParam3) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3): () -> TResult
{
    return { this.invoke(param1, param2, param3) }
}

fun <TParam1, TParam2, TParam3, TParam4, TResult> ((TParam1, TParam2, TParam3, TParam4) -> TResult).partial(param1: TParam1): (TParam2, TParam3, TParam4) -> TResult
{
    return { param2: TParam2, param3: TParam3, param4: TParam4 -> this.invoke(param1, param2, param3, param4) }
}

fun <TParam1, TParam2, TParam3, TParam4, TResult> ((TParam1, TParam2, TParam3, TParam4) -> TResult).partial(param1: TParam1, param2: TParam2): (TParam3, TParam4) -> TResult
{
    return { param3: TParam3, param4: TParam4 -> this.invoke(param1, param2, param3, param4) }
}

fun <TParam1, TParam2, TParam3, TParam4, TResult> ((TParam1, TParam2, TParam3, TParam4) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3): (TParam4) -> TResult
{
    return { param4: TParam4 -> this.invoke(param1, param2, param3, param4) }
}

fun <TParam1, TParam2, TParam3, TParam4, TResult> ((TParam1, TParam2, TParam3, TParam4) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4): () -> TResult
{
    return { this.invoke(param1, param2, param3, param4) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5) -> TResult).partial(param1: TParam1): (TParam2, TParam3, TParam4, TParam5) -> TResult
{
    return { param2: TParam2, param3: TParam3, param4: TParam4, param5: TParam5 -> this.invoke(param1, param2, param3, param4, param5) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5) -> TResult).partial(param1: TParam1, param2: TParam2): (TParam3, TParam4, TParam5) -> TResult
{
    return { param3: TParam3, param4: TParam4, param5: TParam5 -> this.invoke(param1, param2, param3, param4, param5) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3): (TParam4, TParam5) -> TResult
{
    return { param4: TParam4, param5: TParam5 -> this.invoke(param1, param2, param3, param4, param5) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4): (TParam5) -> TResult
{
    return { param5: TParam5 -> this.invoke(param1, param2, param3, param4, param5) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4, param5: TParam5): () -> TResult
{
    return { this.invoke(param1, param2, param3, param4, param5) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).partial(param1: TParam1): (TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult
{
    return { param2: TParam2, param3: TParam3, param4: TParam4, param5: TParam5, param6: TParam6 -> this.invoke(param1, param2, param3, param4, param5, param6) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).partial(param1: TParam1, param2: TParam2): (TParam3, TParam4, TParam5, TParam6) -> TResult
{
    return { param3: TParam3, param4: TParam4, param5: TParam5, param6: TParam6 -> this.invoke(param1, param2, param3, param4, param5, param6) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3): (TParam4, TParam5, TParam6) -> TResult
{
    return { param4: TParam4, param5: TParam5, param6: TParam6 -> this.invoke(param1, param2, param3, param4, param5, param6) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4): (TParam5, TParam6) -> TResult
{
    return { param5: TParam5, param6: TParam6 -> this.invoke(param1, param2, param3, param4, param5, param6) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4, param5: TParam5): (TParam6) -> TResult
{
    return { param6: TParam6 -> this.invoke(param1, param2, param3, param4, param5, param6) }
}

fun <TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, TResult> ((TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult).partial(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4, param5: TParam5, param6: TParam6): () -> TResult
{
    return { this.invoke(param1, param2, param3, param4, param5, param6) }
}
