// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach - Initialize slow and fast pointers at 1, with a count = 1.
//    - Iterate fast from 1 to end:
//       - If nums[fast] == nums[fast - 1], increment count; else reset count = 1.
//       - If count <= k, place nums[fast] at nums[slow] and increment slow.
//    - Return slow as the new length.

import java.util.Arrays;

public class RemoveDuplicatesInSortedArray2 {
    // public int removeDuplicates(int[] nums) {
    //     if(nums.length <= 2) {
    //         return nums.length;
    //     }

    //     int j = 2;
    //     for(int i = 2; i < nums.length; i++) {
    //         nums[j] = nums[i];
    //         if(nums[j] != nums[j - 2]) {
    //             j++;
    //         }
    //     }
    //     return j;
    // }

    //scalable solution due to use of k
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2) {
            return n;
        }

        int k = 2;  //no of duplicates allowed of a occurance
        int slow = 1, fast = 1;
        int count = 1;

        while(fast < n) {
            if(nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }

    public static void main(String[] args) {
        RemoveDuplicatesInSortedArray2 solver = new RemoveDuplicatesInSortedArray2();

        int[] nums1 = {1,1,1,2,2,3};
        int len1 = solver.removeDuplicates(nums1);
        System.out.println("New length: " + len1);
        System.out.println("Array after operations - " + Arrays.toString(nums1));

        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        int len2 = solver.removeDuplicates(nums2);
        System.out.println("\nNew length: " + len2);
        System.out.println("Array after operations - " + Arrays.toString(nums2));
    }
}
