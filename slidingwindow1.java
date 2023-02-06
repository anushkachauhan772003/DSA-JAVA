public class slidingwindow1 {
   public static int countAnagram(String s,String t){
    int k=t.length();
    int start=0;
    int j=0;
    int []map=new int[256];
    int[]map2=new int[256];
    int count=0;
    int ans=0;
    for(int i=0;i<s.length();i++){
        map[t.charAt(i)]++;
        map2[s.charAt(i)]++;
    }
    while(j<s.length()){
        if(j-start+1<k){
            j++;
        }
        if(j-start+1==k){
            if(map[s.charAt(j)]==map2[t.charAt(j)])
            ans++;
           
        }
        
    }
    return count;
    }
    public static void main(String[]args){
        String s="aababaabaa";
        String t="aaba";
        System.out.println(countAnagram(s, t));
    }
}
