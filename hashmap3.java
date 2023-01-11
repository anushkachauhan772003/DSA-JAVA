import java.util.*;

import javax.swing.SpringLayout;
public class hashmap3 {
   //empty or not empty
   public static void main(String[]args){
   HashMap<Integer,String> hm=new HashMap<Integer,String>();
   hm.put(1, "Red");
   hm.put(2,"green");
   hm.put(3,"Black");
   hm.put(4,"white");
   hm.put(5,"blue");

   boolean result=hm.isEmpty();
   System.out.println(result);
   hm.clear();
   boolean result1=hm.isEmpty();
   System.out.println("after clearing-------"+result1);
}
}