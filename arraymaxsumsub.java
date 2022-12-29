public class arraymaxsumsub {
    public static void masSumSub(int[]nums){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length-1;j++){
                curSum=0;
                for(int k=i;k<=j;k++){
                    curSum+=nums[k];
                }
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("maxsum "+maxSum);
    }
    public static void main(String[]args){
        int []nums={1,2,6,-1,3};
        masSumSub(nums);
        System.out.println();
    }
}
