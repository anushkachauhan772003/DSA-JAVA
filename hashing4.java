import java.util.*;
public class hashing4 {
    public static int longSubarrWthSumDivByK(int a[], int k)
    {
        int ans=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       int sum=0;
       int rem=0;
       map.put(0,-1);
       for(int i=0;i<a.length;i++){
        sum+=a[i];
        rem=sum%k;
        if(rem<0){
            rem+=k;
        }
        if(map.containsKey(rem)){
            int idx=map.get(rem);
            int len=i-idx;
            if(len>ans){
                ans=len;
            }
        }
        else{
            map.put(rem,i);
        }
       }
       return ans;
       
    }
    public static void main(String[]args){
        int nums[]={2,7,6,1,4};
        int k=3;
        System.out.println(longSubarrWthSumDivByK(nums, k));
    }
}
