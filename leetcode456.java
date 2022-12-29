import java.util.Stack;

public class leetcode456 {
    public static void find132pattern(int[] nums) {
      int first=0;
      int last=nums.length-1;
       while(first<last){
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
            first++;
            last--;
        }
   
    }
    public static void main(String[]args){
        int[]nums={2,4,6,8,10};
        find132pattern(nums);
        for(int i=0;i<=nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println( );
    }
}
