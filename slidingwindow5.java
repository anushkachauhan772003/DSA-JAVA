public class slidingwindow5 {
    public static int subarraySum(int []nums,int k){
    int i=0;
    int j=0;
    int sum=0;
    int max=0;
    while(j<nums.length){
        sum+=nums[j];
        if(sum<k){
            ++j;
        }
        else if(sum==k){
            max=Math.max(max,(j-i+1));
            ++j;
        }
        else if(sum>k){
            while(sum>k){
                sum=sum-nums[i];
                ++i;
            }
           
        }
       
    }
    return max;
    }
    public static void main(String[]args)
    {
    int num[]={7,1,6,0};
    int k=7;
System.out.println(subarraySum(num, k));
    }
}
