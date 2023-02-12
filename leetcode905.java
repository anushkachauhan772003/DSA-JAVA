public class leetcode905 {
    public static int[] sortArrayByParity(int[] nums) {
        int res[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[j++]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
        }
      

    public static void main(String[]args){
        int nums[]={3,1,2,4};
        System.out.println(sortArrayByParity(nums));
    }
}
