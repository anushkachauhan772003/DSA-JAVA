import java.util.HashSet;
import java.net.SocketTimeoutException;
import java.util.*;
public class leetcode844 {
    public static boolean backSpaceCompare(String s,String t){
    Set<Character> set=new HashSet<>();
    Set<Character> set1=new HashSet<>();
    char ch[]=s.toCharArray();
    char ch2[]=t.toCharArray();
    for(int i=0;i<s.length();i++){
        
        if(set.contains('#')){
            set.remove(ch[i]);
            set.remove(ch[i-1]);
        }
        set.add(ch[i]);
        System.out.println(set+" ");
       }
       for(int i=0;i<t.length();i++){
      
        if(set1.contains('#')){
            set1.remove(ch2[i]);
            set1.remove(ch2[i-1]);
        }
        set1.add(ch2[i]);
        System.out.println(set1
        +" 1");
       }

       return (set==set1);
    
    }
    public static void main(String[]args){
        String s="ab#c";
        String t="ad#c";
        System.out.println(backSpaceCompare(s, t));

    }
}
