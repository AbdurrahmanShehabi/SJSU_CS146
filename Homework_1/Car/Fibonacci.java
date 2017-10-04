public class Fibonacci {

    public int loopFibonacci(int level){
        int a = 0;
        int b = 1;
        int result = 0;
        if(level == 1) return 0;
        if(level == 2) return 1;
        level = level - 2;
        for (int i = 0; i < level; i++){
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public int recursionFibonacci(int level){
        if(level == 1) return 0;
        if(level == 2) return 1;

        int result = recursionFibonacci(level - 2) + recursionFibonacci(level - 1);

        return result;
    }
}
