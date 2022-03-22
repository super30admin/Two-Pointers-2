// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// create two pointers pointing to end of each arr
// loop through until and compare values in both arrays
// if value in arr1 less than arr2, update k pointer to arr2 value
// else update to arr1 value

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = n-1;
        
        int k = m+n-1;
        
        while (i >= 0 && j >= 0) {
            
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            }
            
            else {
                nums1[k] = nums1[i];
                i--;
            }
            
            k--;
        }
        
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}