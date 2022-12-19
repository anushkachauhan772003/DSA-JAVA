import java.util.*;

public class leetcode451 {
    public static String frequencySort(String s) {
        char [] count=new char[256];
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            System.out.println(count);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        frequencySort("tree");
    }
}