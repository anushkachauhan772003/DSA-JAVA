public class subarray {
    public  static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            int sum = 0;
            for(int j=i; j < nums.length; j++){
                if(i == j)
                    sum = nums[i];
                else
                    sum += nums[j];
                if(sum >= k)
                    count++;
            }
        }
        return count;
    } 
    public static void  main(String[]args) {
        int nums[]={1,2,3,4};
        System.out.println(subarraySum(nums,4));
    }
}
