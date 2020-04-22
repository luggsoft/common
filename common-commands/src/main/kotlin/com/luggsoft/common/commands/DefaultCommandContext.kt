package com.luggsoft.common.commands

class DefaultCommandContext(
    private val map: Map<String, Any> = emptyMap()
) : CommandContext, Map<String, Any> by map
