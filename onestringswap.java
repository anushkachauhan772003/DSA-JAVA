import java.util.*;
public class onestringswap {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
        return true;
    List<Integer> l = new ArrayList<>();
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
            l.add(i);
        
        }
        if (l.size() > 2) 
            return false;
    }
    if(l.size()==2 && s1.charAt(l.get(0))==s2.charAt(l.get(1)) && s1.charAt(l.get(1))==s2.charAt(l.get(0))){
        System.out.println(l.get(0)+"    "+l.get(1));
        return true;
    }
      
    return false;
    }
    public static void main(String[]args){
        String s1 = "bank", s2 = "kanb";
        areAlmostEqual(s1, s2);
    }
}
