import java.util.Stack;

public class leetcode151 {
    public static String reverseWords(String s){
        Stack<String>stack=new Stack<>();
        String temp="";
        String  ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(temp.length()>0){
                stack.push(temp);
                temp=" ";
                }
            }
            else
            temp+=s.charAt(i);
        }
        ans+=temp;
        while(!stack.isEmpty()){
            ans=ans+" "+stack.pop();
        }
        if(ans.length()!=0 && s.charAt(0)==' '){
            ans=ans.substring(1);
        }

        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args){
        String s="the sky is blue";
        reverseWords(s);
    }
}
