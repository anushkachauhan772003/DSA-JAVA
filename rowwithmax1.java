import javax.xml.stream.events.EndElement;

public class rowwithmax1 {
    public static int max1(int[][]arr,int n,int m){
    int end=n*m+1;
    int count=0;
    int max=0;
    for(int i=0,j=0;i<m && j<n;i++,j++){
        count+=arr[i][j];
        max=Math.max(count,max);
    }
return max;



    }
    public static void main(String[]args){
       int  N = 4 , M = 4;
       int  Arr[][] = {{0, 1, 1, 1},{0, 0, 1, 1},{1, 1, 1, 1},{0, 0, 0, 0}};
       System.out.println(max1(Arr, N, M));
    }
}
