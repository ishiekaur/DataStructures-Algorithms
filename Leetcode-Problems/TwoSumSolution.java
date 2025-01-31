public class TwoSumSolution {
    
    public static int[] twoSum(int[] nums, int target) {
        // int[] result = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (target == nums[j]+nums[i]){
                    return new int[]{i, j};
                }

            }
        }
        return new int[0];
    }
    
    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; 
        int target = 22;
        
        int[] result = twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
