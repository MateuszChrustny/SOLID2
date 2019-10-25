package pl.androidcoder.solid.lsp.collectionkotlin

import pl.androidcoder.solid.lsp.collection.Storage
import java.util.*

class LimitedStorage<T>(private val limit: Int) : Storage<T> {

    private val list = ArrayList<T>()

    override fun addItem(item: T): Boolean {
        if (list.size >= limit)
            throw LimitExceededException()
        else
            list.add(item)
        return true
    }
}