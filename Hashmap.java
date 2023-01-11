import java.util.*;
public class Hashmap {

    //to count the key value
    //to insert specified map to another map



    public static void main(String[]args){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1, "Red");
        hm.put(2,"green");
        hm.put(3,"Black");
        hm.put(4,"white");
        hm.put(5,"blue");
        //Map.entry 
        for(Map.Entry x : hm.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
          
        }
        System.out.println("size of hashmap "+hm.size());
    }
}
