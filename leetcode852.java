public class leetcode852 {
    public static int peakIndexInMountainArray(int[] arr) {
        if(arr.length<3)
        return -1;
        int s=0;
        int e=arr.length-1;
        int m=0;
        while(s<e){
            m=(s+e)/2;
            if(arr[m]<arr[m+1])
            s=m+1;
            else
            e=m;
        }
        return s;
    }
    public static void main(String[]args){
        int arr[]={0,1,0};
       System.out.println(peakIndexInMountainArray(arr));

    }
}
