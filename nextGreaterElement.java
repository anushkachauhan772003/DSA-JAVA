import java.util.Stack;

public class nextGreaterElement {
    public static int[] nextGreaterNumber(int[]nums){
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            stack.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek();
            }
            else
            ans[i]=-1;
            stack.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(ans[i]+" ");
        }
        return ans;
    }
    public static void main(String[]args){
        int[]nums={1,2,1};
        nextGreaterNumber(nums);
      //  System.out.println(nextGreaterNumber(nums));

    }
}
