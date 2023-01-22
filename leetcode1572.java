public class leetcode1572 {
    public static int diagonalSum(int[][]mat){
        int m=mat.length;
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=mat[i][i];
            sum+=mat[m-1-i][i];
        }
        return m%2==0?sum:sum-mat[m/2][m/2];
    }
    public static void main(String[]args){
        int [][]mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}
