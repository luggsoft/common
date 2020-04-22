package com.luggsoft.common.commands

import com.luggsoft.common.util.logger

abstract class CommandInvokerBase<TCommandContext : CommandContext>(
    private val commandHandlerProvider: CommandHandlerProvider<TCommandContext>
) : CommandInvoker<TCommandContext>
{
    @Throws(CommandInvokerException::class)
    final override fun invokeCommand(command: Command<*>, commandContext: TCommandContext): Any?
    {
        try
        {
            return this.commandHandlerProvider
                .getCommandHandler(command::class)
                .handleCommand(command, commandContext)
        }
        catch (exception: Exception)
        {
            ("Failed to invoke command").also { message ->
                this.logger.error(message, exception)
                throw CommandInvokerException(message, exception)
            }
        }
    }
}
