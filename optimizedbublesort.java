public class optimizedbublesort {
    public static void main(String[]args){
        int nums[]={4,3,7,1,5};
        boolean swapped=false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                swapped=true;
                if(nums[j]>nums[j+1]){
                    swapped=true;
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                if(!swapped){
                    System.out.println("not swapped");
                    break;
                    }

            }
            
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
