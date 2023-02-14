public class leetcode1089 {
    public static void duplicateZeros(int[] arr) {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                res[i]=res[i+1]=0;
                
            }
            else
            res[i]=arr[i];
            System.out.println(res[i]);
        }
    }
    public static void main(String[]args){
       int[] arr = {1,0,2,3,0,4,5,0};
       duplicateZeros(arr);
    }
}
