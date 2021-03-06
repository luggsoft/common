package com.luggsoft.common.util

fun <TElement> MutableCollection<TElement>.extract(predicate: (TElement) -> Boolean): Collection<TElement>
{
    return this.filter(predicate).also { elements ->
        this.removeAll(elements)
    }
}
