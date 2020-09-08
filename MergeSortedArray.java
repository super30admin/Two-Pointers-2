// Time Complexity : O(m+n) where m and n are the length of the arrays
// Space Complexity :O(1) becuase we are using constant space
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// we put our ptr1 and ptr2 on the last index of each array and idx as the last of merged array
// the max value between [ptr1] and [ptr2] is chosen as the value [idx] and respectively ptr1 or ptr2 is decremented 
//  if ptr2>=0 then we have to process ptr2 also.. if ptr1 is left then we dont do anything as it is already processed

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pt1 = m - 1;
        int pt2 = n - 1;
        int idx = m + n - 1;

        // TC O(m+n)

        // lets say c elements are processed in this while loop
        // m+n-c elements will be processed in the next while loop so total tc O(m+n)
        // boundary condition will be <0 for both ptrs
        while (pt1 >= 0 && pt2 >= 0) {
            if (nums2[pt2] >= nums1[pt1]) {
                nums1[idx] = nums2[pt2];
                pt2--;
            } else {
                nums1[idx] = nums1[pt1];
                pt1--;
            }

            idx--;
        }

        // since if pt2 is processed pt1 already is sorted and dont need to be put again
        while (pt2 >= 0) {
            nums1[idx] = nums2[pt2];
            idx--;
            pt2--;
        }
    }
}