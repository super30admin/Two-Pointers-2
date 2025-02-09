// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //we will use 2 pointer
        int p1 = m - 1;
        int p2 = n - 1;

        int ptr = m + n - 1;

        //since both the arrays are sorted. We will pick the largest element among the 2 arrays and add them to end of nums1 pointed by ptr.
        while(p1 >= 0 && p2 >= 0) {

            if(nums1[p1] > nums2[p2]) {
                nums1[ptr] = nums1[p1];
                p1--;
            }
            else {

                nums1[ptr] = nums2[p2];
                p2--;
            }
            ptr--;
        }

        //If all the elements from nums2 are not added to nums1, then p2 will not be less than 0
        //We need to add all elements from nums2 to nums1
        while(p2 >= 0) {

            nums1[ptr] = nums2[p2];
            ptr--;
            p2--;
        }

        //if p1 is >= 0 then it is fine as all elements from nums1 is present in result array
        //Time complexity : O(m + n)
        //Space complexity : O(1)
        
    }
}