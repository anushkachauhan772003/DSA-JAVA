import java.lang.annotation.Target;
import java.util.*;
public class twosum {
    public static int[] findTwo(int[]nums,int t){
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(t-nums[i])){
                res[1]=i;
                res[0]=map.get(t-nums[i]);
             }
             map.put(nums[i],i);
        }
        return res;

    }
    public static void main(String[]args){
        int nums[]={2,7,8,9};
        int t=9;
        System.out.println(findTwo(nums, t));

    }
}
