public class leetcode136 {
    //find missing number
    public static int singleNumber(int[]nums){
        int nas=0;
        for(int i=0;i<nums.length;i++){
            nas^=nums[i];
        }
        return nas;
    }
    public static void main(String[]args){
        int nums[]={1,2,1,4,2};
        System.out.println(singleNumber(nums));
    }
}
