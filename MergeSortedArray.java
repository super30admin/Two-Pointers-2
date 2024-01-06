
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*1, Brut force--- add both arrays and sort Tc: m+nlog(m+n)
  2.
 * using 3 pointers:
 * p1: at the last element non-zero element array-1
 * p2: last element of Array-2
 * p3: last element of array -1;
 * 
 * the greater element from p1 and p2 moves to the p3 position and decreement the p3,
 * and decrement the pointer of the element that shifts to thr end.
 * ----------> if p2 is reached out of bounds then the array is sorted.
 * -----> if p1 is reached out of bounds---- then copied the elements  remaining of array2 to array1.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p1 >= 0 && p2 >= 0)
        {
            if(nums1[p1] >= nums2[p2])
                {
                    nums1[p3] = nums1[p1];
                    p1--;
                }else{
                    nums1[p3] = nums2[p2];
                    p2--;
                }
            p3--;
        }
        while(p2 >= 0)   //p1 is finished and in p2 elemets are there,  then copied array2 elements to array1.
        {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}