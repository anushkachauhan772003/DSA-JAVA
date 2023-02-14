import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode1051 {
    public static int heightChecker(int[]nums){
        int count=0;
        int[]expec=nums.clone();
        Arrays.sort(expec);
       for(int i=0;i<nums.length;i++){
        if(expec[i]!=nums[i])
        count++;
       }
       return count;
    }
    public static void main(String[]args){
        int heights[]={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
