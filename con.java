import java .util.*;
public class con {
    public static int[] separateDigits(int[] nums) {
    ArrayList<Integer>an=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            ArrayList<Integer>an1=new ArrayList<>();
            while(nums[i]!=0){
                an1.add(nums[i]%10);
                nums[i]/=10;
            }
        
        Collections.reverse(an1);
        an.addAll(an1);
        }

        int []res=new int[an.size()];
        for (int i = 0; i <res.length; i++){
        res[i] = an.get(i);
        }

        return  res;
    } 
    public static void main(String[]args){
        int []nums={13,25,83,77};
        System.out.println(separateDigits(nums));

    }
}
