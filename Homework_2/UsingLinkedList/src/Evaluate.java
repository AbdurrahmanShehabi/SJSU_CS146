import java.util.Stack;

public class Evaluate {
    public double evaluatePostfix(String post){
        double result = 0;
        Stack<Double> stack = new Stack<Double>();

        for(int i = 0; i < post.length(); i++){
            if(Character.isDigit(post.charAt(i))){
                stack.push(Character.getNumericValue(post.charAt(i)) * 1.0);
            }
            else if(post.charAt(i) == '='){
                result = stack.peek();
                return result;
            }
            else{
                double num2 = stack.pop();
                double num1 = stack.pop();
                if(post.charAt(i) == '+'){
                    stack.push(num1+num2);
                } else if (post.charAt(i) == '-'){
                    stack.push(num1 - num2);
                } else if (post.charAt(i) == '*'){
                    stack.push(num1*num2);
                } else if (post.charAt(i) == '/'){
                    stack.push(num1/num2);
                }

            }
        }
        return result;
    }

}
