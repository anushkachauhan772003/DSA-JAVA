import javax.lang.model.util.ElementScanner14;

public class leetcode1678 {
    public static String interpret(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='G')
            sb.append('G');
            else if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
            sb.append('o');
            i++;
        }
            else{
            sb.append("al");
            i+=3;
            }

            
        }
        return sb.toString();
    }
    public static void main(String[]args){
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
   

}
