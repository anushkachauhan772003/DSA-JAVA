public class leetcode1768 {
    public static String mergeAlternately(String w1, String w2) {
        StringBuilder sb =new StringBuilder();
        int m=w1.length(),n=w2.length();
        for(int i=0;i<m || i<n ;i++){
            if(i<m)
            sb.append(w1.charAt(i));
            if(i<n)
            sb.append(w2.charAt(i));
        }
        return sb.toString();

    }
    public static void main(String[]args){
        String word1 = "abc";
         String word2 = "pqr";
         System.out.println(mergeAlternately(word1, word2));
    }
}
