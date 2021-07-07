
// Time Complexity :O(m+n) m is the length of nums1 and n is the length of nums2
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english : Using 3 pointers, 2 for comparing the array elements
// and the 3rd one to keep track of the position in the nums1 array to put the greater number of compared elements.  

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n-1;
        int k = m + n - 1;
        
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }
            else{
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}