import java.util.*;
public class leetcode2215 {
    public static boolean halvesAreAlike(String s) {
        String vowels="aeiouAEIOU";
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        int mid=s.length()/2;
        int ans=0;
        for(int i=0;i<mid;i++){
            if(vowels.indexOf(a.charAt(i))>=0)ans++;
            if(vowels.indexOf(b.charAt(i))>=0)ans--;

        }
        return ans==0;
      
    }

    public static void main(String[] args) {

        halvesAreAlike("textbook");
    }
}