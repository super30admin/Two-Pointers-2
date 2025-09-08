// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * Use two pointers to compare value of elements and start filling it from the end
 * Place the larger element at the end of the array and decrement the appropriate pointers
 * If there is anything remaining in num2, copy it directly over to nums1
 */

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = nums1.length - 1;

        while(p1 >= 0 && p2 >= 0){
            if(nums2[p2] > nums1[p1]){
                nums1[index] = nums2[p2];
                p2--;
            }
            else{
                nums1[index] = nums1[p1];
                p1--;
            }
            index--;
        }
        // as in the first while loop the condition for p1 is being checked once, we need to make sure all the elements in nums2 array are also copied over to nums1, we do that using this while loop
        while(p2 >= 0){
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
}