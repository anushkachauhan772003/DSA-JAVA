import java.util.*;
public class leetcode205{
public static boolean isomorphicString(String s,String t){
int m1[]=new int[256];
int m2[]=new int[256];
int count=0;
for(int i=0;i<256;i++){
    m1[i]=m2[i]=-1;
}
for(int i=0;i<s.length();i++){
    if(m1[s.charAt(i)]!=m2[t.charAt(i)])
    return false;
    m1[s.charAt(i)]=m2[t.charAt(i)]=i+1;
}
return true;
}
public static void main(String[]args){
    String s="egg";
    String t="add";
    isomorphicString(s, t);

}
}