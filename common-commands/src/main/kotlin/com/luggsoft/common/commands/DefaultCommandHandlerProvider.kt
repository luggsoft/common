package com.luggsoft.common.commands

class DefaultCommandHandlerProvider(
    mappings: Iterable<CommandHandlerMapping<Command<*>, DefaultCommandContext, *>>
) : CommandHandlerProviderBase<DefaultCommandContext>(
    mappings = mappings
)
