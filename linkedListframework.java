import java.util.LinkedList;
import java.util.*;
public class linkedListframework {
    public static void main(String[]args){
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
