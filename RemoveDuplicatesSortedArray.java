import java.util.Arrays;
// Time Complexity : O(n) one pass solution
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Approach: We will use the concept of slow and fast pointers here, where the fast pointer will keep on moving, whereas
//the slow pointer will only move when we swap the element at fast pointer with element at slow pointer if count of current element at i <= 2
public class RemoveDuplicatesSortedArray {

    /**
     * @param nums the array with duplicate elements
     * @return     the number of elements left after removing duplicates
     */
    public int removeDuplicates(int[] nums) {
        int slow = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) count++;
            else count = 1;

            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        final RemoveDuplicatesSortedArray duplicatesSortedArray = new RemoveDuplicatesSortedArray();
        int[] nums = new int[] {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4};
        System.out.println(duplicatesSortedArray.removeDuplicates(nums)); // return 9
        System.out.println(Arrays.toString(Arrays.copyOf(nums, 9))); //[0, 0, 1, 1, 2, 2, 3, 4, 4]

        nums = new int[] {1, 1, 1, 2, 2, 3};
        System.out.println(duplicatesSortedArray.removeDuplicates(nums)); // return 5
        System.out.println(Arrays.toString(Arrays.copyOf(nums, 5))); //[1, 1, 2, 2, 3]

        nums = new int[] {0,0,1,1,1,1,2,3,3};
        System.out.println(duplicatesSortedArray.removeDuplicates(nums)); // return 7
        System.out.println(Arrays.toString(Arrays.copyOf(nums, 5))); //[0, 0, 1, 1, 2, 2, 3]
    }
}
