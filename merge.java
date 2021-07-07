// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m-1;
        int second = n-1;
        
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){		// base case
            return;
        }
        for(int i = m+n-1; i >= 0; i--){			// traverse through nums1 array
            if(second < 0){							// if the nums2 pointer is out of bound, terminate the process
                break;
            }
            if(nums1[first] > nums2[second]){		// if last element in nums1 is greater than last element in nums2, put the element in nums1 last position
                nums1[i] = nums1[first];
                (first)--;
            }else{
                nums1[i] = nums2[second];			// if last element in nums1 is greater than last element in nums2, put the element in nums1 last position
                (second)--;
            }
        }
    }
}