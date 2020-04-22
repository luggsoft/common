package com.luggsoft.common.commands

import com.luggsoft.common.util.JsonMapped

interface Command<TResult : Any?> : JsonMapped
