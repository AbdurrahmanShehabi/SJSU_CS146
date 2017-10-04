public class FibonacciMain {
    public static  void main(String[] args){

        Fibonacci test = new Fibonacci();

        System.out.printf("loopFibonacci at level %d is %d%n", 8, test.loopFibonacci(8));

        System.out.printf("recursionFibonacci at level %d is %d%n", 8, test.recursionFibonacci(8));

    }
}
