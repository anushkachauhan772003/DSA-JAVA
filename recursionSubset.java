import java.util.ArrayList;
import java.util.Arrays;;
public class recursionSubset {

    public static  ArrayList<Integer> sumSub(int[]arr){
        ArrayList<Integer>sumSubset=new ArrayList<>();
      
        func(arr,0,arr.length,sumSubset,0);
        Arrays.sort(arr);
        return sumSubset;
    }
 static void func(int[]ar,int ind,int l,ArrayList<Integer>sumsubset,int sum){
    if(ind==l){
        sumsubset.add(sum);
        return;
    }
    func(ar, ind+1, l, sumsubset,sum+ar[ind]);
    func(ar, ind+1, l, sumsubset, sum);
    }
    public static void main(String[]args){
        int[]nums={1,3,2};
        System.out.println(sumSub(nums));
       


    }
}
