import java.util.*;;
public class stackleet {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack();
        int cur = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(cur);
                cur = 0;
            } else {
                cur = stack.pop() + Math.max(1, cur*2);
            }
        }
        return cur; 
    }
    public static void main(String args[]){
        String s="(()(()))";
        scoreOfParentheses(s);

    }
}
