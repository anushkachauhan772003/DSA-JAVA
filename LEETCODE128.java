import java.util.*;
public class LEETCODE128 {
    public static int longestConsecutive(int[]nums){
        Arrays.sort(nums);
        int ans=1;
        int sum=1;
        int curSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curSum)continue;
            if(nums[i]==curSum+1){
                curSum++;
                sum++;
                ans=Math.max(ans, sum);
            }
            else{
                curSum=nums[i];
                sum=1;
            }
        }
        return ans;


    }


    public static void main(String[]args){
int[]nums={100,4,200,1,2,3};
System.out.println(longestConsecutive(nums));

    }
}
