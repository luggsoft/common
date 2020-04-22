package com.luggsoft.common.commands

import kotlin.reflect.KClass

interface CommandHandlerProvider<TCommandContext : CommandContext>
{
    fun getCommandHandler(commandClass: KClass<out Command<*>>): CommandHandler<Command<*>, TCommandContext, *>
}
