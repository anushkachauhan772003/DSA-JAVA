import java.util.*;
import java.util.LinkedList;

public class slidingwindow2 {
    public static long[] firstNegative(long[]a,int n,int k){
        int i=0;
        int j=0;
        long[]result=new long[n-k+1];
        int idx=0;
        Queue<Long>q=new LinkedList<>();
        while(j<n){
            if(a[j]<0){
                q.add(a[j]);
            }
            if(j-i+1<k)
            j++;
            else if(j-i+1==k){
                if(q.isEmpty())
                result[idx++]=0;
                else{
                long num=q.peek();
                result[idx++]=num;
                if(num==a[i])
                q.poll();
                }
                i++;
                j++;
             }
            
        }
        return result;
    }
    public static void main(String[]args){
        long A[] = {-8, 2, 3, -6, 10};
        int n=5;
        int k=2;
        firstNegative(A, n, k);
        System.out.println(firstNegative(A, n, k));
    }
}
