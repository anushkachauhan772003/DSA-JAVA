public class leetcodemovingzeroes {
    public static void moveZeroes(int[]nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
            while(index<nums.length){
                nums[index++]=0;
            }
            System.out.println(nums[i]);
        }
    }
    public static void main(String[]args){
        int[]nums={1,0,5,6};
        moveZeroes(nums);
    
    }
}
