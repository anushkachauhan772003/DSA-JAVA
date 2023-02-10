public class leetcode643 {
    public static double findMaxAverage(int[]nums,int k){
        int i=0;
        int j=0;
        double average=0;
        double max=Integer.MIN_VALUE;
        int sum=0;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k)
            j++;
            else if(j-i+1==k){
              max=Math.max(max,sum);
              sum-=nums[i];
              i++;
              j++;
            }
        }
        return max/k;
    }
    public static void main(String[]args){
        int[]nums={1,12,-5,-6,50,3};
        int k=4;
        findMaxAverage(nums, k);
        System.out.println(findMaxAverage(nums, k));

    }
}
