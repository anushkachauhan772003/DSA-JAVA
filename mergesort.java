public class mergesort {
    public static void merge(int[]arr,int p,int q,int r){
        int m=q-p+1;
        int n=r-q;
        int l[]=new int[m];
        int t[]=new int[n];

        for(int i=0;i<m;i++){
            l[i]=arr[p+i];
        }
        for(int j=0;j<n;j++){
            t[j]=arr[q+j+1];
        }
       int i,j,k;
       i=0;
       j=0;
       k=p;
       while(i<m && j<n){
        if(l[i]<=t[j]){
            arr[k]=l[i];
            i++;
        }
        else{
            arr[k]=t[j];
            j++;
        }
        k++;
        }

        while(i<m){
            arr[k]=l[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=t[j];
            k++;
            j++;
        }

    }
    public static void mergeSort(int[]arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);


        }
    }
    public static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        int nums[]={4,9,3,2};
        mergeSort(nums, 0, nums.length-1);
        print(nums);


    }
}
