
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* 
1. Check from the end of the two values arrayes (i.e. the m and n adresses of the two respective arrays)
2. Put the max value at the end of the array1 represented by the i pointer.
3. Put all the remaining elements in array2 into array1 in the end
*/

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ptr1 = m-1;
        int ptr2 = n-1;
        int i = m+n-1;
        while(ptr1>=0 && ptr2>=0) {
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
            i--;
        }
        
        while(ptr2>=0) {
            nums1[i] = nums2[ptr2];
            ptr2--; i--;
        }
    }
}
