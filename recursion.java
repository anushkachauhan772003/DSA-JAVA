import java.util.*;
public class recursion {
    static int count=0;
    public static void subSequence(List<Integer>temp,int i,int[]ar,int n){
       
        if(i==n){
            for(int el:temp){
                System.out.println(el+" ");
            }
            if(temp.size()==0)
            System.out.println("{}");
                return;
            }
        
            temp.add(ar[i]);
            subSequence(temp, i+1,ar,n);
            temp.remove(temp.size() - 1);
            subSequence(temp, i+1, ar, n);
          
        }
    public static void main(String[]args){
        int n=3;
        int sum=2;
        int ar[]={3,1,2};
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        subSequence(new ArrayList<>(),0, ar, n);
        

    }
}
