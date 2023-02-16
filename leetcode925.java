import java.util.*;
public class leetcode925 {
    public static boolean isLongPressed(String name,String typed){
        if(name.length()>typed.length())
        return false;
        //two pointer approach
        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(i>0 && name.charAt(i-1)==typed.charAt(j))
            j++;
            else 
            return false;
        }
        while(j<typed.length()){
            if(name.charAt(i-1)!=typed.charAt(j))
            return false;
            j++;
        }

        return true;
    }
    public static void main(String[]args){
        String name = "rick", typed =  "kric";
        System.out.println(isLongPressed(name, typed));
    }
}
