public class nextGreatestLetter {
    public static char nextLetter(char[]ch,char target){
        int start=0;
        int end=ch.length;
        char res=ch[0];
        while(start<=end){
            int mid=(start+end)/2;
            if(ch[mid]<target)
            start=mid+1;
            else if(ch[mid]==target)
            start=mid+1;
            else if(ch[mid]>target){
                res=ch[mid];
                end=mid-1;
            }
            
            }
            return res;
        }
    public static void main(String[]args){
        char[] ch={'c','f','g','h'};
        char target='c';
        System.out.println(nextLetter(ch, target));

    }
}
