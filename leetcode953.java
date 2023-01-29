public class leetcode953 {
    public static boolean isAlienSorted(String[] words, String order) {
        int arr[]=new int[26];
        int s=0;
        for(char ch:order.toCharArray()){
            arr[ch-'a']=s++;
        }
        for(int i=0;i<words.length-1;i++){
            String cur=words[i];
            String next=words[i+1];
            int len=Math.min(cur.length(),next.length());
            if(len!=cur.length() && len==next.length() && cur.startsWith(next)){
                return false;
            }
        
            for(int j=0;j<len;j++){
                if(arr[cur.charAt(j)-'a']>arr[next.charAt(j)-'a']){
                return false;
                }
                if(arr[cur.charAt(j)-'a']<arr[cur.charAt(j)-'a']){
                break;
                }
            }
            
        }
        return true;
    }
    public static void main(String[]args){
        String words[] = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        isAlienSorted(words, order);
       System.out.println(isAlienSorted(words, order));
    }
}
