package com.luggsoft.common.commands

interface CommandHandler<TCommand : Command<TResult>, TCommandContext : CommandContext, TResult : Any?>
{
    fun handleCommand(command: TCommand, commandContext: TCommandContext): TResult
}
