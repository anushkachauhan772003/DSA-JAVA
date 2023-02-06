import java.util.*;
public class recursionpermutation {
    public static List<List<Integer>> permutations(int []nums){
        List<List<Integer>>res=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        backtrack(nums,res,new ArrayList<>(),visited);
        return res;
    }
    private static void backtrack(int []nums,List<List<Integer>>res,List<Integer>ans,boolean[]visited){
        if(ans.size()==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                ans.add(nums[i]);
                backtrack(nums, res, ans, visited);
                ans.remove(ans.size()-1);
                visited[i]=false;
            }
        }
    }
    public static void main(String[]args){
        int nums[]={1,2,3};
       
        System.out.println(permutations(nums));
    }
}
