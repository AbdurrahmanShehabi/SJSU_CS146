public interface BagInterface<T> {
    public int getCurrentSize();
    public boolean isEmpty();
    public boolean add(T newEntry);
    public T remove(T anEntry);
    public boolean remove();
    public int getFrequencyOf(T anEntry);
    public boolean contains(T anEntry);
}
