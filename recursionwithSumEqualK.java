import java.util.List;
import java.util.ArrayList;
public class recursionwithSumEqualK {
    public static void sub(int s,int sum,int i,int n,List<Integer>res,int ar[]){
        if(i>=n){
            if(s==sum){
                for(int el:res){
                    System.out.print(el+" ");
                }
                System.out.println();
            
            }
            return;
        }
        res.add(ar[i]);
        s+=ar[i];
        sub(s, sum, i+1, n, res, ar);
        res.remove(res.size()-1);
        s-=ar[i];
        sub(s, sum, i+1, n, res, ar);

    }
    public static void main(String[]args){
        int sum=2;
        int ar[]={1,2,1};
        sub(0,sum,0,3,new ArrayList<Integer>(),ar);

    }
}
