package com.luggsoft.common.commands

import kotlin.reflect.KClass

abstract class CommandHandlerProviderBase<TCommandContext : CommandContext>(
    mappings: Iterable<CommandHandlerMapping<Command<*>, TCommandContext, *>>
) : CommandHandlerProvider<TCommandContext>
{
    private val commandHandlerFactoryMap = mappings
        .associate { mapping -> mapping.commandClass to mapping.commandHandlerFactory }

    @Throws(CommandHandlerProviderException::class)
    final override fun getCommandHandler(commandClass: KClass<out Command<*>>): CommandHandler<Command<*>, TCommandContext, *>
    {
        try
        {
            return this.commandHandlerFactoryMap
                .getValue(commandClass)
                .createCommandHandler()
        }
        catch (exception: NoSuchElementException)
        {
            throw CommandHandlerProviderException("Failed to get command handler because no command handler factory was registered for that command class", exception)
        }
        catch (exception: Exception)
        {
            throw CommandHandlerProviderException("Failed to get command handler", exception)
        }
    }
}
