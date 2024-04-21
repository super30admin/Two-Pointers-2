
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * Three pointers: 
 * currentIndex -> points to the end of array nums1
 * pointer1 -> points to the end of m-1 in nums1
 * pointer2 -> points to the n-1 in nums2
 * 
 * If we start to check from start example: nums1[2,5,6,0,0] & nums2[3,4] 
 *          -> we can't be sure that 3 exists or not in nums1 or not.. because nums1 has a chance to have every possible element greater than 3
 *          -> we can for sure tell that the there is nothing higher than 4 in nums2 and nothing higher than 6 in nums1. -> we use this property
 * 
 * if nums[2] array has all lesser subelements like nums1[5,6,7,0,0] and nums[2,4]
 * then we do traverse on the while alone
 * 
 * Question to self: Should i use for or while? While because i check for two conditions pointer1>=0 && pointer2>=0 and which pointer gets decremented
 *  depends on the value at that point in index so. While is better.
 * 
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int currentIndex = m + n - 1;

        while (pointer1 >= 0 && pointer2 >= 0) {
            if (nums1[pointer1] > nums2[pointer2]) {
                nums1[currentIndex] = nums1[pointer1];
                pointer1--;
            } else {
                nums1[currentIndex] = nums2[pointer2];
                pointer2--;
            }
            currentIndex--;
        }

        while (pointer2 >= 0) {
            nums1[currentIndex] = nums2[pointer2];
            pointer2--;
            currentIndex--;
        }
    }
}