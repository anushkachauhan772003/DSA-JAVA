public class countelements {
    public static int countElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max && nums[i] > min) {
                count++;
            }
        }
        return count;
    }

    public static void mian(String[] args) {
        int[] nums = { 11, 7, 2, 15 };
        System.out.println(countElements(nums));

    }
}
