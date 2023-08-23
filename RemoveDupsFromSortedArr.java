// SC = 0(1)
// TC = 0(n)

import java.util.Arrays;

public class RemoveDupsFromSortedArr {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        RemoveDupsFromSortedArr obj = new RemoveDupsFromSortedArr();
        int obj1 = obj.sortArr(arr);
        System.out.println("size = " + obj1);
        System.out.println("array is =" + Arrays.toString(arr));

    }

    public int sortArr(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int slow = 0;
        int count = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == nums[slow]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

}
