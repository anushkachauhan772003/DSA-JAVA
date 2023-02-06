import java.util.ArrayList;

public class slidingwindow2 {
    public static long[] firstNegative(long[]a,int n,int k){
        int i=0;
        int j=0;
        ArrayList<Long>list=new ArrayList<>();
        ArrayList<Long>ans=new ArrayList<>();

        while(j<n){
            if(a[j]<0){
                list.add(a[j]);
            }
            if(j-i+1<k)
            j++;
            else if(j-i+1==k){
                if(list.size()==0)
                 ans.add((long)0);

                else
                ans.add(list.get(0));
            }
        }
    }
    public static void main(String[]args){
        long A[] = {-8, 2, 3, -6, 10};
        int n=5;
        int k=2;
        firstNegative(A, n, k);
        System.out.println(firstNegative(A, n, k));
    }
}
