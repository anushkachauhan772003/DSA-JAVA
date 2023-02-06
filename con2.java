import java.util.*;
public class con2 {
    public static int left(int[]nums,int n, int maxSum){
        ArrayList<Integer>ans=new ArrayList<>();
        boolean bn[]=new boolean[1001];
        
        for(int i:nums){
            bn[i]=true;
        }
        for(int i=1;i<=n;i++){
            if(!bn[i]){
                ans.add(i);
            }
        }
        if(ans.isEmpty())return 0;
        Arrays.sort(nums);
       int sum=0;
       int count=0;
        for(int i=0;i<nums.length;i++){
            while(sum<=maxSum){
                sum+=nums[i];
                count++;
            }
        }
    return count;
    }
      public static void main(String[]args){
        int []nums={1,6,5};
        System.out.println(left(nums,5,6));


      }
}
