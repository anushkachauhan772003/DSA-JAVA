import java.util.*;

public class recursionCount{
    public static int countThe(int s,int target,int i,int n,int []arr){
        if(i==n){
            if(s==target)
            return 1;
            return 0;

        }
        s+=arr[i];
        int l=countThe(s, target, i+1, n, arr);
        s-=arr[i];
        int r=countThe(s, target, i+1, n, arr);
        return l+r;

    }
    public static void main(String[]args){
        int ar[]={10,1,2,7,6,1,5};
        int sum=8;
        int n=7;
        Arrays.sort(ar);
       
        System.out.println( countThe(0, sum, 0, n, ar));
    }
}