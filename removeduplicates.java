public class removeduplicates {
    public static int removeDuplicates(int[]nums){
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String []args){
        int []nums={1,1,3,4,5,5};
        removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));
    }
}
