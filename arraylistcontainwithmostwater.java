import java.util.ArrayList;

public class arraylistcontainwithmostwater {
    public static int water(ArrayList<Integer>list){
        int lp=0;
        int rp=list.size()-1;
        int maxWater=0;
        while(lp<rp){
            int ht=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int curWater=ht*width;
            maxWater=Math.max(maxWater, curWater);
            if(list.get(lp)<list.get(rp))
            lp++;
            else
            rp--;
        }
        return maxWater;
    }
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(water(list));

    }
}
