public class Bag<T> implements BagInterface<T> {

    private Object[] bag;
    private int num;
    int count;

    @SuppressWarnings("unchecked")
    public Bag(int n){

        bag = (T[]) new Object[n];
        num = 0;
        count = 0;
    }

    public int getCurrentSize(){
        return count;
    }
    public boolean isEmpty(){
        if(count == 0)
            return true;
        else
            return false;
    }
    public boolean add(T newEntry){
        if(count < bag.length){
            bag[num] = newEntry;
            num++;
            count++;
            return true;
        }
        else
            return false;

    }
    public T remove(T anEntry){
        int index = bag.length;
        for (int i = 0; i < bag.length; i++){
            if (anEntry.equals(bag[i])){
                index = i;
                break;
            }
        }
        Object[] current =(T[]) bag[index];
        for (int i = index; i < bag.length-1; i++) {
            Object next = bag[index+1];
            bag[index] = next;
        }
        num--;
        count--;
        return current;
    }

    public boolean remove(){
        if(count > 0){
            bag[num - 1] = null;
            count--;
            num--;
            return true;
        }
        else
            return false;
    }
    public int getFrequencyOf(T anEntry){
        int count = 0;
        for (int i = 0; i < bag.length; i++) {
            if (bag[i].equals(anEntry)) {
                count++;
            }
        }
        return count;
    }

    public boolean contains(T anEntry){
        for (int i = 0; i < bag.length; i++) {
            if (bag[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }
}
