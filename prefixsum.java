public class prefixsum {
    public static void main(String[]args){
        int []nums={2,5,7,10,15,16,13};
        int prefixsum[]=new int[nums.length];
        prefixsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixsum[i]+=prefixsum[i-1]+nums[i];
            System.out.println(prefixsum[i]);
        }
    }
}
