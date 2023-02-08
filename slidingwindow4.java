import java.util.*;
public class slidingwindow4 {
    public static int[] slideMax(int[]a,int k){
        int n = a.length;
        int[]r = new int[n-k+1];
        int r1 = 0;
    // store index
    Deque<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < a.length; i++) {
    // remove numbers out of range k
    if (!q. isEmpty() && q.peek()== i - k) {
            q.poll();
    }
    // remove smaller numbers in k range as they are useless
    while (!q.isEmpty() && a[q.peekLast()] <a[i]) {
            q.pollLast();
    }
    q.offer(i);
    if (i >k - 1) {
    r[r1++] = a[q.peek()];
    } 
    }
    return r;
        
    }
    public static void main(String[]args){
        int[]ar={1, 3, -1, -3, 5, 3, 6, 7};
        int a=3;
        System.out.println(slideMax(ar, a));
    }
}
