public class leetcode1309 {
    public static String freqAlphabets(String s) {
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='#'){
                String u=s.charAt(i-2)+""+s.charAt(i-1);
                res=(char)(Integer.parseInt(u)+96)+res;
                i=i-2;
                
            }
            else{
                res=(char)(Integer.parseInt(String.valueOf(ch))+96)+res;
            }
            
        }
        return res;
    }
    public static void main(String[]args){
String s="10#11#12";
System.out.println(freqAlphabets(s));
    }
   
}
