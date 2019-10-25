package pl.androidcoder.solid.lsp.solve.collectionkotlin

import pl.androidcoder.solid.lsp.collection.Storage
import pl.androidcoder.solid.lsp.collectionkotlin.LimitExceededException
import java.util.*

class LimitedStorage<T>(private val limit: Int) : Storage<T> {

    private val list = ArrayList<T>()

    override fun addItem(item: T): Boolean {
        if (list.size >= limit)
            return false
        else
            list.add(item)
        return true
    }

    fun addNewItem(item: T) {
        if (!addItem(item)) throw LimitExceededException()
    }
}