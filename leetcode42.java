public class leetcode42 {
    public static int trap(int[]height){
        int l=height.length;
        int mxl[]=new int[l];
        int mxr[]=new int[l];
        mxl[0]=height[0];
        mxr[l-1]=height[l-1];
        for(int i=1;i<l;i++){
            mxl[i]=Math.max(mxl[i-1],height[i]);
        }
        for(int i=l-2;i<l;i++){
            mxr[i]=Math.max(mxr[i+1])
        }



    }
    public static void main(String[]args){

    }
}
