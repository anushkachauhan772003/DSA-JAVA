import java.util.*;
public class recursion1 {
    public static void findSubsequnece(int ind,int[]arr,List<Integer>res,int n){
        if(ind==n){
            for(int el:res){
                System.out.print(el+" ");
            }
            System.out.println();
            return;
        }
        res.add(arr[ind]);
        findSubsequnece(ind+1, arr, res, n);
        res.remove(res.size()-1);
        findSubsequnece(ind+1, arr, res, n);
    }
    public static void main(String[]args){
        int n=3;
        int ar[]={3,1,2};
        findSubsequnece(0,ar,new ArrayList<>(),n);

    }
}
