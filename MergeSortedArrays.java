
public class Solution {

    // LeetCode Problem #88
    // Time Complexity - O(m + n)
    // Space Complexity - O(1)

    // updating!!
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int first = m - 1, second = n - 1;

        while(first >= 0 && second >= 0) {
            if(nums1[first] > nums2[second]) {
                nums1[first + second + 1] = nums1[first];
                first--;
            } else {
                nums1[first + second + 1] = nums2[second];
                second--;
            }
        }

        while(second >= 0) {
            nums1[second] = nums2[second];
            second--;
        }
    }

}