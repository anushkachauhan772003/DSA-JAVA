public class countingsort {
    public static int getMax(int[]arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
    public static int[] count(int[]nums,int n){
        int[]output=new int[n+1];
        int max=getMax(nums, n);
        int count[]=new int[max+1];

        for(int i=0;i<=max;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        for(int i=1;i<=max;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            output[count[nums[i]]-1]=nums[i];
            count[nums[i]]--;
        }
        for(int i=0;i<n;i++){
            nums[i]=output[i];
            System.out.print(nums[i]+" ");
        }
        return nums;
    }
    public static void main(String[]args){
        int []nums={2,3,3,4,5,7,7};
        System.out.println(count(nums, 7));

    }
}
