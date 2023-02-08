import java.util.*;

public class slidingwindow3 {
    public static void countAnagram(String s,String t){
        int i=0;
        int j=0;
        int k=t.length();
        int ans=0;
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
        }
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) >= 0){
                    count++;
                }
            }
            if(j-i+1<k)
            j++;
            else if(j-i+1==k){
                if(count==k)
                ans++;
                char ch2=
            }
        }

    }
    public static void main(String[]args){
        String s="forxxorfxdofr";
        String t="for";
      countAnagram(s, t);

    }
}
