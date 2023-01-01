import java.util.*;

public class findlonenly {
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer>res=new ArrayList<Integer>();
        int count[]=new int[256];
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            count[nums[i]]++;
          
        }
        for(int i=0;i<nums.length;i++){
            if((list.contains(nums[i]-1)) || (list.contains(nums[i]+1))){
               if(count[i]>1){
                list.remove(nums[i]);
               }
               continue;
            }
            else
            res.add(nums[i]);
        }

return res;
    }
    public static void main(String[]args){
        int []nums = {10,6,5,8};
        System.out.println(findLonely(nums));
    }
    
}
