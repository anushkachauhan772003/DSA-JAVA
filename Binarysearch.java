public class Binarysearch {
    public static int search(int[]nums,int t){
        int left=0;
        int right=nums.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==t)
            return mid;
            if(nums[mid]<t){
                left=mid+1;
            }
            else
            right=mid-1;
        }
        return -1;
    }
    public static void main(String[]args){
        int[]nums={1,2,3,4,5};
        int t=4;
        System.out.println(search(nums, t));

    }
}
