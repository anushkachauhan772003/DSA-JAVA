public class leetcode387unique {
    public static int firstUnique(String s){
        int count[]=new int[256];
        for(int i=0;i<s.length();i++){
           count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1)
            return i;
        }
        return -1;
    }
    public static void main(String[]args){

    }
    
}
