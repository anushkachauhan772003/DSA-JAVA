

public class subarraywithsumzero {
    public static boolean findSum(int[]nums){
        int i=0;
        int j=0;
        int ans=0;
        int k=1;
        boolean found=false;
        while(j<nums.length){
            if(ans<k){
                ans+=nums[j];
                j++;
            }
            else if(ans==0){
                return found=true;
            }
            if(found==false)
            k++;

        }
        return found;
    }
   public static void main(String[]args){
    int[]nums={4,2,1,-3,6};
    System.out.println(findSum(nums));

   } 
}
