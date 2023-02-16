public class quicksort {
    public static int  partition(int low,int high){

    }
    public static void qs(int l,int h){
        if(l<h){
            int pivot=partition(l, h);
            qs(l, pivot+1);
            qs(pivot+1, h);
        }
    }
    public static void main(String[]args){

    }
}
