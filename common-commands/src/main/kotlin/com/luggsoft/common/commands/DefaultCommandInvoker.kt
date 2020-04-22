package com.luggsoft.common.commands

class DefaultCommandInvoker(
    commandHandlerProvider: CommandHandlerProvider<DefaultCommandContext>
) : CommandInvokerBase<DefaultCommandContext>(
    commandHandlerProvider = commandHandlerProvider
)
