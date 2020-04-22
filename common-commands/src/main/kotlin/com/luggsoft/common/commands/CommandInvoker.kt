package com.luggsoft.common.commands

interface CommandInvoker<in TCommandContext : CommandContext>
{
    fun invokeCommand(command: Command<*>, commandContext: TCommandContext): Any?
}
