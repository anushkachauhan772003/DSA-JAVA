import java.util.*;
public class leet496 {
    public static int[] nextGreater(int[]nums1,int[]nums2){
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        Stack<Integer>stack=new Stack<>();
        int result[]=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
        int el=nums2[i];
            while(!stack.isEmpty() && stack.peek()<el){
                map.put(stack.pop(), el);
           
            }
            System.out.println(stack.push(el));
        }
        for(int i=0;i<nums1.length;i++){
            result[i]=map.getOrDefault(nums1[i], -1);
            System.out.println(result[i]);
        }

        return result;

    }
    public static void  main(String[]args){
        int num1[]={1,4,2};
        int num2[]={1,3,4,2};
        System.out.println(nextGreater(num1, num2));

    }
}
