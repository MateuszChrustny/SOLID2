package pl.androidcoder.solid.lsp.collection;

public interface Storage<T>{
    /**
     * Add item into storage
     * @param item - any item to add
     * @return true if add with success or false when item is not add
     */
    public boolean addItem(T item);
}
