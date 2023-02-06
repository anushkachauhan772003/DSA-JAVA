import java.util.*;

public class recursionCount{
    private void findCom(List<List<Integer>>res,List<Integer>ans,int ind,int target,int arr[]){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && (arr[i]==arr[i-1]))continue;
            if(arr[i]>target)break;
               
            ans.add(arr[i]);
            findCom(res,ans,ind+1,target-arr[i],arr);
            ans.remove(ans.size()-1);
            }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       
        Arrays.sort(candidates);
         List<List<Integer>>res=new ArrayList<List<Integer>>();
        findCom(res,new ArrayList<>(),0,target,candidates);
        return res;
    }
    
    
}