package com.luggsoft.common.commands

class CommandHandlerFactory<TCommand : Command<TResult>, TCommandContext : CommandContext, TResult : Any?>(
    private val block: () -> CommandHandler<TCommand, TCommandContext, TResult>
)
{
    fun createCommandHandler(): CommandHandler<TCommand, TCommandContext, TResult>
    {
        return this.block.invoke()
    }
}
