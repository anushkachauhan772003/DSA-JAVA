import java.util.*;
public class Nextpermutation {
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        List<Integer>list=new ArrayList<>();
        int i=N-2;
        int j=N-1;
        for(int k=0;k<N;k++){
            list.add(arr[k]);
        }
        while(i>=0 && arr[i]>arr[i+1]){
            i--;
        }
        while(j>=0 && arr[j]<arr[i])
        j--;
        swap(arr,i,j);
    }
    void swap(int[]arr,int start,int end){
        int temp=list.get
    }
    public static void main(String args[]){
    int  N = 6,arr[] = {1, 2, 3, 6, 5, 4};
    System.out.println(nextPermutation(N, arr));
    }
}
