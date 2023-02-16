import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class stack1 {
    public static int calcPoints(String[]operations){
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i]=="+"){
                int s1=stack.pop();
                int s2=stack.pop();
                int sum=s1+s2;
                stack.push(s1);
                stack.push(s2);
                stack.push(sum);
            }
            else if(operations[i]=="C"){
                stack.pop();
            }
            else if(operations[i]=="D"){
                stack.push(stack.peek()*2);
            }
            else
            stack.push(Integer.parseInt(operations[i]));
        }
        int res=0;
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;

    }
    public static void main(String args[]){
        String []ops={"5","2","C","D","+"};
        System.out.println(calcPoints(ops));
    }
}
