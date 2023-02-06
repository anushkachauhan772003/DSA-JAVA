import java.util.*;
public class recursionsubset2 {
    public static List<List<Integer>>subsum2(int[]nums){
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
    
        backtrack(0, nums,new ArrayList<>(), res);
        return res;

        
    }
    static void backtrack(int ind,int []arr,List<Integer>ans,List<List<Integer>>res){
            res.add(new ArrayList<>(ans));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1])continue;
            ans.add(arr[i]);
            backtrack(ind+1, arr, ans, res);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[]args){
        int nums[]={1,2,2};
        System.out.println(subsum2(nums));
    }
}
