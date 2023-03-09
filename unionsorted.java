import java.util.*;
public class unionsorted {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer>res=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int j:arr2){
            set.add(j);
        }
        for(int v:set){
            res.add(v);
        }
        Collections.sort(res);
        return res;
       
          
    }
    public static void main(String[]args){
       int  n = 5, arr1[] = {1, 2, 3, 4, 5}  ;
        int m = 3, arr2 [] = {1, 2, 3};
        System.out.println(findUnion(arr1, arr2, n, m));

    }
}
