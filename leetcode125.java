import java.util.*;
public class leetcode125{

public static boolean isPalindrome(String s) {
    String S=s.toLowerCase();
StringBuilder sb=new StringBuilder();
for(int i=0;i<S.length();i++){
    if(Character.isLetter(S.charAt(i)) && Character.isDigit(S.charAt(i))){
        sb.append(S.charAt(i));
    }
}
int n=sb.length()-1;
for(int i=0;i<n/2;i++){
if(S.charAt(i)==S.charAt(n-i))
return true;
}
return false;

}
public static void main(String args[]){
    String s="ana";
isPalindrome(null);
}
}
