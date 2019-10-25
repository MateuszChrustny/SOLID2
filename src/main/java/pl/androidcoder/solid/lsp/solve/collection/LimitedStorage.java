package pl.androidcoder.solid.lsp.solve.collection;

import pl.androidcoder.solid.lsp.collection.Storage;

import java.util.ArrayList;

public class LimitedStorage<T> implements Storage<T> {

    private int limit;

    private ArrayList<T> list = new ArrayList<>();

    public LimitedStorage(int itemLimit) {
        limit = itemLimit;
    }

    @Override
    public boolean addItem(T item) {
        if (list.size() >= limit)
            return false;
        else
            list.add(item);
        return true;
    }

    public void addNewItem(T item) throws LimitExceededException {
        if (!addItem(item)) throw new LimitExceededException();
    }
}
