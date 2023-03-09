import java.util.*;
public class hashmaping3 {
    public static int largestSum(int []nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0){
                max=i+1;
            }
            else{
                if(map.get(sum)!=null){
                    max=Math.max(max,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    }
    public static void main(String[]args){
        int nums[]= {15,-2,2,-8,1,7,10,23};
        System.out.println(largestSum(nums));

    }
}
