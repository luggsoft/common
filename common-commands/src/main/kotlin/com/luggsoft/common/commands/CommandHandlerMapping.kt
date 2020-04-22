package com.luggsoft.common.commands

import kotlin.reflect.KClass

class CommandHandlerMapping<TCommand : Command<TResult>, TCommandContext : CommandContext, TResult : Any?>(
    val commandClass: KClass<out TCommand>,
    val commandHandlerFactory: CommandHandlerFactory<TCommand, TCommandContext, TResult>
)
