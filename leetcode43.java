public class leetcode43 {
    public static void   multiply(String m,String n){
        int l1=m.length();
        int l2=n.length();
        for(int i=l1-1,j=l2-1;i>0 || j>0;i--,j--){
            int ld=m.charAt(i)+n.charAt(j);
            System.out.println(ld);

        }

    }
    public static void main(String[]args){
        String m="6";
        String n="73";
        multiply(m, n);
    }
}
