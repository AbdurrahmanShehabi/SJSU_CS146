import java.util.EmptyStackException;

public class DoubleStack {
    private int indexStack1;
    private int indexStack2;
    private int[] stackArray;
    private int size;

    DoubleStack (int size) {
        this.indexStack1 = 0;
        this.indexStack2 = size - 1;
        this.size = size;
        stackArray = new int[size];
    }

    public int peekStack1(){
        try {
            if (indexStack1 != 0)
                return stackArray[indexStack1];
            else
                throw new EmptyStackException();
        }
        catch (EmptyStackException e){
            System.out.println(e);
        }
        return 0;
    }
    public int peekStack2(){
        try {
            if (indexStack1 != size)
                return stackArray[indexStack2];
            else
                throw new EmptyStackException();
        }
        catch (EmptyStackException e){
            System.out.println(e);
        }
        return 0;
    }
    public int popStack1(){
        try {
            if (indexStack1 != 0){
                int a = indexStack1;
                indexStack1--;
                return stackArray[a];
            }
            else
                throw new EmptyStackException();
        }
        catch (EmptyStackException e){
            System.out.println(e);
        }
        return 0;

    }

    public int popStack2(){
        try {
            if (indexStack2 != size){
                int a = indexStack2;
                indexStack1++;
                return stackArray[a];
            }
            else
                throw new EmptyStackException();
        }
        catch (EmptyStackException e){
            System.out.println(e);
        }
        return 0;
    }

    public void pushStack1(int num){
        try{
            if(indexStack1 <= indexStack2){
                stackArray[indexStack1] = num;
                indexStack1++;
            }
            else
                throw new StackOverflowError();
        }
        catch (StackOverflowError e) {
            System.out.println(e);
        }
    }

    public void pushStack2(int num){
        try{
            if(indexStack1 <= indexStack2){
                stackArray[indexStack2] = num;
                indexStack2--;
            }
            else
                throw new StackOverflowError();
        }
        catch (StackOverflowError e) {
            System.out.println(e);
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Stack1: ");
        for(int i = 0; i < indexStack1; i++) {
            str.append(Integer.toString(stackArray[i]) + " ");
        }
        str.append("\nStack2: ");
        for(int i = size-1; i > indexStack2; i--) {
            str.append(Integer.toString(stackArray[i]) + " ");
        }
        return str.toString();
    }
}
