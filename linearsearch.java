public class linearsearch {
    public static int linear(int[]nums,int t){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t)
            return i;
        }
        return -1;
    }
    public static void main(String[]args){
        int []nums={1,2,3,4};
        int t=2;
        System.out.println(linear(nums, t));


    }
}
