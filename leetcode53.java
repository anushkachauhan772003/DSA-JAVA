public class leetcode53 {
    public static int maximumSumSub(int[]nums){
        int sum=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=nums[i];
            }
            else
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String args[]){
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        maximumSumSub(arr);
    }
}
