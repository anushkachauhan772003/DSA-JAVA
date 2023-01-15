import java.util.*;
public class leetcode704BinaryS{
    public static int find(int[]nums,int target){
        int start=0;
        int end=nums.length;
        int mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]==target)System.out.println(mid);
            if(nums[mid]>target)
            start++;
            else
            end--;
        }
        return -1;
    }
    public static void main(String[]args){
        int[]nums={-1,0,3,5,9,12};
        int target=9;
        find(nums, target);
    }
}
