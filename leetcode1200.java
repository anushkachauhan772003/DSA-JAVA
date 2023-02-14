import java.util.*;

import javax.xml.stream.events.EndElement;
public class leetcode1200 {
    public static List<List<Integer>> minAbDiff(int []nums){
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        int diff=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            diff=nums[i+1]-nums[i];
            if(diff<min){
                min=diff;
                res.clear();
                res.add(Arrays.asList(nums[i],nums[i+1]));
            }
            else if(diff==min){
                res.add(Arrays.asList(nums[i],nums[i+1]));
            }
        }
        return res;
    }
    public static void main(String[]args){
        int nums[]={4,2,1,3};
        System.out.println(minAbDiff(nums));

    }
}
