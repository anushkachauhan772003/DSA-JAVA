public class leetcode69 {
    public static int mysquare(int x){
        int right=x;
        int left=1;
        int mid=0;
        int tem=0;
        if(x==1)
            return 1;
        while(left<right){
            mid=(left+right)/2;
            System.out.println("mid "+mid);
            tem=x/mid;
            System.out.println(tem);
            if(tem==mid)
                return mid;
            else if(tem<mid){
                right=mid;
            }
            else
                left=mid+1;
        }
       return left-1;
    }
    public static void main(String[]args){
        int x=8;
        mysquare(8);
        //System.out.println(mysquare(x));
    }
}
