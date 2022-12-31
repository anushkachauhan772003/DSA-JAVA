import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String s){
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                stack.add(c);
            }
            else{
                if(c=='}' && stack.peek()!='{')return false;
                if(c==')' && stack.peek()!='(')return false;
                if(c==']' && stack.peek()!='[')return false;
                stack.pop();

            }
        }

        System.out.println(stack.empty());
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String s="{}[]";
        isValid(s);
    }
}
