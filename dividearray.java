public class dividearray {
    public static boolean divideArray(int []nums){
        int[]count=new int[501];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i:count){
            if(i%2!=0)
            return false;

        }
        return true;
    }
    public static void main(String[]args){
        int []nums={1,2,3,3,2,1};
        divideArray(nums);
        System.out.println(divideArray(nums));
    }
}
