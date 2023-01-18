import java.util.Arrays;

public class leetcode976 {
    public static int largePeri(int []nums){
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<nums[i-1]+nums[i-2])
            return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
    public static void main(String[]args){
        int []l={1,2,1};
        System.out.println(largePeri(l));
    }
}
