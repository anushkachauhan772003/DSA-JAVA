import java.util.ArrayList;

public class leetcode1470 {
    public static int[] shuffle(int[] nums, int n) {
      int []ans=new int[2*n];
      ans[nums.length-1]=nums[nums.length-1];
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
        }
      
        for(int i=1;i<=n;i=i+2){
            ans[i]=nums[n];
            n++;
        }
        return ans;

    }
    public static void main(String[]args){
int arr[]={2,5,1,3,4,7};
int n=3;
System.out.println(shuffle(arr, n));
    }
}
