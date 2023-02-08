import java.util.*;
public class slidingwindow1 {
   public static long maxSum(int k,int n, ArrayList<Integer>list){
    int i=0;
    int j=0;
    long sum=0;
    long max=0;
    while(j<n){
        sum+=list.get(j);
        if(j-i+1<k)
        j++;
       else if(j-i+1==k){
        max=Math.max(max,sum);
        sum-=list.get(i);
        i++;
        j++;
       }
    }
    return max;
   }
    
    public static void main(String[]args){
       int n=4;
       int k=2;
       ArrayList<Integer>list=new ArrayList<>();
       list.add(100);
       list.add(200);
       list.add(300);
       list.add(400);
       
    System.out.println(maxSum(k,n,list));
    }
}
