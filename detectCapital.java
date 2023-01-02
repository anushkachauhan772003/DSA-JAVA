public class detectCapital {
    public static boolean detectCapitalUse(String word) {
     return word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) || word.substring(1).equals(word.substring(1).toLowerCase());
    }
    public static void main(String[]args){
        String s="aFushka";
        System.out.println(detectCapitalUse(s));
    }
}
