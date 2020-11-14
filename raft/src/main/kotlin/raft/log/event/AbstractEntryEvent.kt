package raft.log

import raft.log.entry.Entry

abstract class AbstractEntryEvent<T : Entry?>(val entry: T)

