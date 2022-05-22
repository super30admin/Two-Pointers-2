/**
 * Two pointers
 * https://leetcode.com/problems/merge-sorted-array/submissions/
 * 
 * time: O(n) or O(m) => O(n)
 * space: O(1)
 * 
 * Leetcode: Yes
 * 
 * Approach:
 * As both are sorted arrays, we can start from the bigger element
 * and compare the two, and place it at the end of the nums1
 * 
 * 1. Place two pointers at the last element of each two arrays respectively
 * 2. place a third pointer i at the end of the bigger array ie. nums1 
 * 3. compare the two elements and put the bigger element at i
 *   decrement the bigger element pointer and i
 * 4. If any of the two pointers goes out of bound while decrementing <0 then stop
 *    if the 1st pointer goes out of bounds
 *      copy all the remaining elements from the nums2 array to the nums1 array
 * 
 */
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1 == null) return;
        
        int p1 = m-1;
        int p2 = n-1;
        
        int i = m+n-1;
        
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }
        
        while(p2 >= 0){
            nums1[i] = nums2[p2];
            i--;
            p2--;
        }
        
    }
}