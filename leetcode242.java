public class leetcode242 {
    public static boolean isAnagram(String s,String t){
        int count[]=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)]--;
        }
        for(int i=0;i<t.length();i++){
        if(count[i]!=0)
        return false;
        }

    return true;
    }
    public static void main(String[]args){
        String s="anagram";
        String t="gramana";
        isAnagram(s, t);
    }
    
}
