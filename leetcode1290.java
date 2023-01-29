import java.util.*;

import javax.xml.transform.Source;
public class leetcode1290 {
    public static void main(String[]args){
        //binary no to integer
        Scanner sc=new Scanner(System.in);
        int res=0;
        int n=sc.nextInt();
            while(n!=0){
            int ld=n%10;
            res=res*2+ld%10;
            n=n/10;
            }
            System.out.println(res);
    }
}
