import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class arrayList {
    public static void Swap(ArrayList<Integer>list,int idx,int idx2){
        int temp=list.get(idx);
        list.set(idx, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[]args){
        //java collection frameWork
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        //add operation
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
         System.out.println(list);
         //get operation
         int ele=list.get(2);
         System.out.println(ele+" ");

         //print reverse 
         for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+" rev");
         }

         //find maximum 
         int max=Integer.MIN_VALUE;
         for(int i=0;i<list.size()-1;i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
         }
        System.out.println("MAX--"+max);

        //Swap 2 no
        int idx=1,idx2=3;
        System.out.println("not swapped "+ list);
         Swap(list, idx, idx2);
         System.out.println("Swapped "+list);

         //sorting ArrayList

         System.out.println(list);
         Collections.sort(list);
         System.out.println("sorted "+list);

         //Multidimensional array
         ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
         ArrayList<Integer>list4=new ArrayList<>();
         ArrayList<Integer>list5=new ArrayList<>();
         ArrayList<Integer>list6=new ArrayList<>();
         for(int i=1;i<=5;i++){
            list4.add(i);
            list5.add(i*2);
            list6.add(i*3);
         }
         mainList.add(list4);
         mainList.add(list5);
         mainList.add(list6);

         System.out.println(mainList);
         

    }
}
