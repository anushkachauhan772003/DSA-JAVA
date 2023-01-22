import javax.xml.transform.Source;

public class leetcode2544 {
    public static int alternateSum(int n){
        String s=Integer.toString(n);
        int []arr=new int[s.length()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
         }
         int sum=0;
         for(int i=0;i<arr.length;i++){
            if(i%2==0)sum=sum+arr[i];
            else sum=sum-arr[i];
         }
         return sum;
    }
    public static void main(String[]args){
        System.out.println(alternateSum(521));

    }
}
