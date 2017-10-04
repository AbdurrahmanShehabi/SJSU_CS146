public class Main {
    public static void main(String[] args){
        AVL<Integer> myAVLtree = new AVL<>();

        myAVLtree.insert(2);
        myAVLtree.insert(1);
        myAVLtree.insert(4);
        myAVLtree.insert(5);
        myAVLtree.insert(9);
        myAVLtree.insert(3);
        myAVLtree.insert(6);
        myAVLtree.insert(7);

        System.out.println("PreOrder:");
        myAVLtree.printPreOrder();
        System.out.println("");
        System.out.println("InOrder:");
        myAVLtree.printInOrder();
        System.out.println("");
        System.out.println("PostOrder:");
        myAVLtree.printPostOrder();
        System.out.println("");
        System.out.println("");

        System.out.println("PALINDROME TEST");
        System.out.println("race car:");
        System.out.println(Palindrome.isPalindrome("race car"));
        System.out.println("papap:");
        System.out.println(Palindrome.isPalindrome("papap"));
        System.out.println("palindrome:");
        System.out.println(Palindrome.isPalindrome("ispalindrome"));

    }
}
