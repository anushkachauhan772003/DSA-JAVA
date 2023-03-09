public class countingsort {
    public static int[] countitngSort(int[]nums){
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int []count=new int[max+1];
        int output[]=new int[n];
        for(int i=0;i<nums.length;i++){
            ++count[nums[i]];
        }
        //for positioning in the count array
        for(int i=1;i<=max;i++){
            count[i]=count[i]+count[i+1];
        }
        for(int i=n-1;i>=0;i--){
            output[--count[nums[i]]]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=output[i];
        }
        return  nums;

    }
    public static void main(String[]args){
        int []nums={2,1,1,0,2,5,4,0,2,8};
        System.out.println(countitngSort(nums));

    }
}
