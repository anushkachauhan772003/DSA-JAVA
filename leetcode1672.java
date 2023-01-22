public class leetcode1672 {
    public static int maxWealth(int[][]accounts){
        int max_wea=0;
        int cur_w=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                cur_w+=accounts[i][j];
                System.out.println(accounts[i][j]);
                max_wea=Math.max(cur_w,max_wea);
            }
          
        }
        return max_wea;
    }
    public static void main(String[]args){
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maxWealth(accounts));
    }
}
