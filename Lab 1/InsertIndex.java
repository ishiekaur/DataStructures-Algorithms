public class InsertIndex {
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 2, 5, 9, 11, 15};
        int test1 = findInsertIndex(testArray, 7);
        int test2 = findInsertIndex(testArray,-5);
        int test3 = findInsertIndex(testArray, 5);
        int test4 = findInsertIndex(testArray, 20);
        System.out.println("Should say 3: " + test1);
        System.out.println("Should say 0: " + test2);
        System.out.println("Should say 2: " + test3);
        System.out.println("Should say 6: " + test4);
    }

    public static int findInsertIndex(int[] sortedArr, int target){
        
        int low = 0;
        int high = sortedArr.length - 1;
        int mid = (low + high)/2;
        int i = 0;

        if (target>sortedArr[high]){
            return high+1;
        }

        while (low <= high && i <10)
        {
            mid = (low + high)/2;
            if (low == high){
                break;
            }
            if (sortedArr[mid] < target) {
                low = mid++;
            } else if (sortedArr[mid] > target) {
                high = mid--;
            }
            i++;
        }
        return mid;
    }
}
