public class leetcode888 {
    public static int[] candySwap(int[]alice,int[]bob){
        int sum1=0;
        int sum2=0;
        int res[]=new int[2];
        int j=0;
        for(int i=0;i<alice.length-1;i++){
            if(alice[i]+bob[j]==alice[i+1]+bob[j+1])
            res[0]=alice[i];
            res[1]=bob[j];

        }
        return res;

    }
    public static void main(String[]args){
        int aliceSizes[] = {1,1}, bobSizes[] = {2,2};
        candySwap(aliceSizes, bobSizes);
        System.out.println(candySwap(aliceSizes, bobSizes));
    }
}
