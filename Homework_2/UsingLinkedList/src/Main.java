import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        IntersectionUnion test1 = new IntersectionUnion();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(11);
        list1.add(12);
        list1.add(17);

        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(7);
        list2.add(11);
        list2.add(12);
        list2.add(17);
        System.out.println("Intersection");
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1 = test1.intersection(list1, list2);
        for(int i = 0; i<array1.size();i++){
            System.out.println(array1.get(i));
        }
        System.out.println("");
        System.out.println("Union");

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2 = test1.union(list1, list2);
        for (int i = 0; i<array2.size();i++) {
            System.out.println(array2.get(i));
        }

        Evaluate testPostfix = new Evaluate();
        System.out.println();
        System.out.print("Evaluate Postfix 326*+: ");
        System.out.println(testPostfix.evaluatePostfix("326*+="));

        System.out.println();
        System.out.print("Evaluate Postfix 962/-: ");
        System.out.println(testPostfix.evaluatePostfix("962/-="));

        System.out.printf("\n\n");
        DoubleStack testDoubleStack = new DoubleStack(5);
        testDoubleStack.pushStack1(1);
        testDoubleStack.pushStack1(2);
        testDoubleStack.pushStack1(3);
        testDoubleStack.pushStack2(1);
        testDoubleStack.pushStack2(2);
        System.out.println(testDoubleStack.toString());


        System.out.printf("\n\n");
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> P = new ArrayList<>();
        ArrayList<Integer> Q = new ArrayList<>();
        L.add(5);
        L.add(6);
        L.add(7);
        L.add(9);
        L.add(4);
        L.add(1);
        P.add(1);
        P.add(4);
        P.add(5);
        Generate generateTest = new Generate();
        Q = generateTest.Generate(L,P);

        System.out.println("Print Q: ");
        for(int i = 0; i < Q.size(); i++){
            System.out.println(Q.get(i));
        }


    }
}
