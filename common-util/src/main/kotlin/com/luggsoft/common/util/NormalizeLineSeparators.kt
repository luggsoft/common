package com.luggsoft.common.util

fun CharSequence.normalizeLineSeparators(): CharSequence = this
    .toString()
    .replace("\r\n", "\n")
    .replace("\r", "\n")
