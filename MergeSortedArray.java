/**Leetcode Question 88 - Merge Sorted Array */
/**Algorithm - Two Pointer
 * Set two pointers p1 and p2 at the end of the nums1(non zero elements) and nums2
 * Check if nums1[p1] > nums2[p2], place the value at the end of the nums1 array and decrement both pi and index pointer else do the visa versa
 * Check if the elements are still left in the nums2 array and put them all the in the nums1 array
 */
/**TC = O(M+N)
 * SC = O(1)
 */
public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if(nums1 == null || nums1.length ==0){
                return;
            }
            int index = nums1.length-1;
            int p1 = m-1;
            int p2 = n-1;
            while(p1>=0 && p2>=0){
                if(nums2[p2] >= nums1[p1]){
                    nums1[index] = nums2[p2];
                    p2--;
                }
                else{
                    nums1[index] = nums1[p1];
                    p1--;
                }
                index--;
            }
            while(p2>=0){
                nums1[index] = nums2[p2];
                p2--;
                index--;
            }
        }
    }
}
