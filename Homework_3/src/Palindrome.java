import java.util.Stack;

public class Palindrome {

    public static boolean isPalindrome(String word) {

        if (word.length() == 0){
            return true;
        }

        Stack<Character> myStack = new Stack<>();
        word = word.replaceAll("\\s+","");
        int odd = word.length() % 2;
        for (int i = 0; i < word.length()/2; i++){
            myStack.push(word.charAt(i));
        }

        for (int i = word.length()/2 + odd; i < word.length(); i++) {
             if (myStack.pop() != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
