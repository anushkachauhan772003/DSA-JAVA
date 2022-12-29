import java.util.Stack;

public class leetcode739{

    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer>stack=new Stack<>();
       int n=temperatures.length-1;
       int result[]=new int[n];
       for(int i=n-1;i>=0;i--){
        while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
            System.out.println(temperatures[stack.peek()]);
            stack.pop();
        }
        if(!stack.isEmpty()){
            result[i]=stack.peek()-i;
        }

        stack.push(i);
       }
       return result;
    }
public static void main(String args[]) {
    
}
}