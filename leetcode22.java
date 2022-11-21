import java.util.*;
public class leetcode22{

    static List<String> result=new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
       generatevalue(result,0,0,n,"");
       return result;
   }
   public static void generatevalue(List<String>result,int open,int close,int n,String str){
       if(str.length()==2*n){
           result.add(str);
           return;
       }
       if(open<n){
           generatevalue(result,open+1,close,n,str+"(");
       }
       if(close<open){
           generatevalue(result,open,close+1,n,str+")");
       }
   }
   public static void main(String[]args){
    generateParenthesis(3);
   }

}