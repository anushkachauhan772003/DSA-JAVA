import java.net.SocketTimeoutException;

public class hashing1 {
    public static void main(String[]args){
        int nums[]={1,2,4,3,4,5};
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<i-1;j++){
                if(nums[i]!=nums[j])
                count++;
                else 
                count--;
            }
        }
        System.out.println(count);
    }
}
