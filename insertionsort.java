public class insertionsort {
    public static void inser(int []nums){
        int n=nums.length;
        for(int j=1;j<n;j++){
            int key=nums[j];
            int i=j-1;
            while(i>-1 && nums[i]>key){
                nums[i+1]=nums[i];
                i--;
            }
        nums[i+1]=key;
        }
        

    }
    public static void main(String[]args){
        int []nums={46,5,6};
        inser(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
