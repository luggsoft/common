package com.luggsoft.common.commands

import kotlin.reflect.KClass

inline fun <reified TCommand : Command<TResult>, TCommandContext : CommandContext, TResult : Any?> commandHandlerMappingOf(
    commandClass: KClass<TCommand>,
    commandHandlerFactory: CommandHandlerFactory<TCommand, TCommandContext, TResult>
): CommandHandlerMapping<Command<*>, TCommandContext, *>
{
    val commandHandlerMapping = CommandHandlerMapping(
        commandClass = commandClass,
        commandHandlerFactory = commandHandlerFactory
    )
    return commandHandlerMapping as CommandHandlerMapping<Command<*>, TCommandContext, *>
}

inline fun <reified TCommand : Command<TResult>, TCommandContext : CommandContext, TResult : Any?> commandHandlerMappingOf(
    commandHandlerFactory: CommandHandlerFactory<TCommand, TCommandContext, TResult>
): CommandHandlerMapping<Command<*>, TCommandContext, *>
{
    return commandHandlerMappingOf(
        commandClass = TCommand::class,
        commandHandlerFactory = commandHandlerFactory
    )
}

inline fun <reified TCommand : Command<TResult>, TCommandContext : CommandContext, TResult : Any?> commandHandlerMappingOf(
    noinline block: () -> CommandHandler<TCommand, TCommandContext, TResult>
): CommandHandlerMapping<Command<*>, TCommandContext, *>
{
    return commandHandlerMappingOf(
        commandHandlerFactory = CommandHandlerFactory(block)
    )
}
