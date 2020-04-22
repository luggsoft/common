package com.luggsoft.common.commands.examples

import com.luggsoft.common.commands.CommandContext
import com.luggsoft.common.commands.CommandHandlerProvider
import com.luggsoft.common.commands.CommandInvokerBase

class ExampleCommandContext : CommandContext

class ExampleCommandInvoker(
    commandHandlerProvider: CommandHandlerProvider<ExampleCommandContext>
) : CommandInvokerBase<ExampleCommandContext>(
    commandHandlerProvider = commandHandlerProvider
)

