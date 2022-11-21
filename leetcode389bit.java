public class leetcode389bit {
    public static char findTheDifference(String s, String t) {
        char c=0;
        for(int i=0;i<s.length();i++){
            c^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            c^=t.charAt(i);
        }

      System.out.println(c);
        return c;
    }
    public static void main(String []args){
        String s="abcd";
        String t="abcde";
        findTheDifference(s, t);

    }
}
