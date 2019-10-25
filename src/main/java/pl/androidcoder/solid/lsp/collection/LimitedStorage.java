package pl.androidcoder.solid.lsp.collection;

import java.util.ArrayList;

public class LimitedStorage<T> implements Storage<T> {

    private int limit;

    private ArrayList<T> list = new ArrayList<>();

    public LimitedStorage(int itemLimit){
        limit = itemLimit;
    }

    @Override
    public boolean addItem(T item) {
        if(list.size() >= limit)
            throw new LimitExceededException();
        else
            list.add(item);
        return true;
    }
}
