public class MaxSubArray {
    public static void main(String[] args) {
        int[] example1 = new int[]{4, -5, 3, 2, -4, 8, -3};
        int[] example2 = new int[]{-2, -1};
        int[] example3 = new int[]{3, 2, 5};
        System.out.println("Should be 9: "+ maxSubArray(example1));
        System.out.println("Should be 0: "+ maxSubArray(example2));
        System.out.println("Should be 10: "+ maxSubArray(example3));
    }

    public static int maxSubArray(int[] nums) {

        int maxCurr = nums[0];
        int total = nums[0];
        int empty = 0;

        for (int i = 1; i <= nums.length - 1; i++){
            maxCurr = Math.max(nums[i], maxCurr + nums[i]);
            if (maxCurr>total){
                total = maxCurr;
            }
            if (total<=0){
                total = empty;
            }
        }

        return total;
    }
}
