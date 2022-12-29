import javax.swing.SpringLayout;

public class dividearrayinequalpair {
    public static boolean divideArray(int []nums){
        int count[]=new int[501];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=0;i<count.length;i++){
            int f=count[i];
            if(f%2!=0){
                System.out.println("false");
            return false;
            }
        }
        System.out.println("true");
        return true;
    }
    public static void main(String[]args){
        int []nums={3,3,2,2,3};
        divideArray(nums);
    }
}
