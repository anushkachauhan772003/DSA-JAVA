import java.util.*;
public class hashmap2 {
    //to put all the values in another hashmap
    public static void main(String[]args){
        HashMap<Integer,String>hm1=new HashMap<Integer,String>();
        HashMap<Integer,String>hm2=new HashMap<Integer,String>();
        hm1.put(1,"red");
        hm1.put(2,"green");
        hm1.put(3,"Black");

        System.out.println(hm1+" ");
        hm2.put(4,"Black");
        hm2.put(5,"blue");
        hm2.put(6,"red");
        System.out.println(hm2);
        

        

    }
}
