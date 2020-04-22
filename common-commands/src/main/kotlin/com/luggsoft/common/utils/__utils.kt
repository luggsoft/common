package com.luggsoft.common.utils

import org.intellij.lang.annotations.Language

fun optional(condition: Boolean, block: () -> String): String
{
    return when (condition)
    {
        true -> block()
        else -> String()
    }
}

fun generatePartialFunction(c: Int, i: Int): String
{
    val fR = (1..c)
    val iR = (1..i)
    val rR = ((i + 1)..c)

    @Language("kotlin")
    fun generate(): String = """
        fun <${fR.joinToString { n -> "TParam$n" }}, TResult> ((${fR.joinToString { n -> "TParam$n" }}) -> TResult).partial(${iR.joinToString { n -> "param$n: TParam$n" }}): (${rR.joinToString { n -> "TParam$n" }}) -> TResult {
            return { ${rR.joinToString { n -> "param$n: TParam$n" }}${optional(i < c) { " -> " }}this.invoke(${fR.joinToString { n -> "param$n" }})}
        }
    """

    return generate().trimIndent()
}

fun generate()
{
    (1..6).forEach { c ->
        (1..c).forEach { i ->
            val function = generatePartialFunction(c, i)
            println(function)
        }
    }
}

fun main()
{
    generate()
}

///

infix fun <TOperand1 : Comparable<TOperand2>, TOperand2> TOperand1.asEqualTo(operand2: TOperand2): (TOperand2) -> Boolean
{
    return { this == operand2 }
}

infix fun <TOperand1 : Comparable<TOperand2>, TOperand2> TOperand1.asLessThan(operand2: TOperand2): (TOperand2) -> Boolean
{
    return { this < operand2 }
}

infix fun <TOperand1 : Comparable<TOperand2>, TOperand2> TOperand1.asGreaterThan(operand2: TOperand2): (TOperand2) -> Boolean
{
    return { this > operand2 }
}

infix fun <TOperand1 : Comparable<TOperand2>, TOperand2> TOperand1.asLessThanEqualTo(operand2: TOperand2): (TOperand2) -> Boolean
{
    return { this <= operand2 }
}

infix fun <TOperand1 : Comparable<TOperand2>, TOperand2> TOperand1.asGreaterThanEqualTo(operand2: TOperand2): (TOperand2) -> Boolean
{
    return { this >= operand2 }
}

///

