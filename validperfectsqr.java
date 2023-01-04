public class validperfectsqr {
    public static boolean isSquare(int num){
        int left=1,right=num,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(mid*mid==num)
            return true;
            if(mid*mid<num)
            left=mid+1;
            else
            right=mid-1;
        }
        return false;
    }
    public static void main(String[]args){
int n=14;
System.out.println(isSquare(n));
    }
}
