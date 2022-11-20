class main{
    public static int lengthOfLongestSubstring(String s){
        
        if(s.length()==0)
        return 0;
        int l=0;
        int r=0;
        int ans=0;
        int count[] =new int[128];
        while(r<s.length()){
            count[s.charAt(r)]++;
            while(count[s.charAt(r)]>1){
                count[s.charAt(l)]--;
                l--;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        System.out.println(ans);
return ans;
    }
        public static void main(String args[]){
        
            lengthOfLongestSubstring("abcabcbb");
    }
}