import java.util.*;
public class leetcode58{
    public static int lengthOfLastWord(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                if(count>0)
                return count;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s="    hello world ";
        lengthOfLastWord(s);
    }

}