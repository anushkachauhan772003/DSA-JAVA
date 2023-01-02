
public class shuffleString {
    public static String shuffleS(String s,int[]in){
       char[]ch=new char[in.length];
        for(int i=0;i<s.length();i++){
            ch[in[i]]=s.charAt(i);
        }
        System.out.println(new String(ch));
        return new String(ch);
    }
    public static void main(String args[]){
        int []indices={4,5,6,7,0,2,1,3};
        String s="codeleet";
        shuffleS(s, indices);

    }
}
