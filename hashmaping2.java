import java.util.*;
public class hashmaping2 {
    public static ArrayList<Integer> countDistinct(int []A,int k){
        {
            // code here
           ArrayList<Integer> ans =new ArrayList<>();
                
                  HashMap<Integer,Integer> hs = new HashMap<>();
                  int j =0;
                for(int i =0;i<A.length;i++){
                    if(i<k){
                        if(hs.containsKey(A[i])){
                            hs.put(A[i],hs.get(A[i])+1);
                        }
                        else{
                            hs.put(A[i],1);
                        }
                    }
                    else{
                       ans.add(hs.size());
                       if(hs.get(A[j])== 1){
                           hs.remove(A[j]);
                       }
                       else
                       {
                           hs.put(A[j],hs.get(A[j])-1);
                       }
                       j++;
                       if(hs.containsKey(A[i])){
                           hs.put(A[i],hs.get(A[i])+1);
                       }else{
                           hs.put(A[i],1);
                       }
                    }
                    
                }
                      
                  ans.add(hs.size());
            return ans;
                 
            }
    }

    public static void main(String[]args){
        int nums[]={1,2,3,1,3,3,4,5};
        int k=4;
        System.out.println(countDistinct(nums, k));

    }
}
