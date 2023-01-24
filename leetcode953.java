public class leetcode953 {
    public static boolean isAlienSorted(String[] words, String order) {
        String curWord=words[0];
        for(int i=0;i<order.length()-1;i++){
            
            if(curWord.charAt(i)<order.charAt(i))
            return true;
        

        }
        return false;
    }
    public static void main(String[]args){
        String words[] = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
       System.out.println(isAlienSorted(words, order));
    }
}
