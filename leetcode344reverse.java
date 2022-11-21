public class leetcode344reverse {
    public static void reverseString(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
           char temp=s[left];
           s[left]=s[right];
           s[right]=temp;
           left++;
           right--;
        }
        System.out.println(s);
    }
    public static void main(String[]args){
        char[]c={'a','m','y','k'};
        reverseString(c);
      
    }
}
