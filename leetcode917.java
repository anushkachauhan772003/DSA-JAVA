public class leetcode917{
    public static String reverseOnlyLetters(String s){
       StringBuilder sb=new StringBuilder(s);
       for(int i=0,j=s.length()-1;i<j;++i,--j){
        while(i<j && !Character.isLetter(s.charAt(i)))
        ++i;
        while(i<j && !Character.isLetter(s.charAt(j)))
        --j;
        sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j,s.charAt(i));
       }
       return sb.toString();
        }
      
    public static void main(String[]args){
        String a="a-edjejk-edjheb";
        reverseOnlyLetters(a);


    }
}