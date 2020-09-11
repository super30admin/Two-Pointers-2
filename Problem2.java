Time Complexity: O(n). n is length of array nums1.
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int curr = nums1.length - 1, p1 = m - 1, p2 = n - 1;
        
        while(p1 >= 0 && p2 >= 0){
            if(nums2[p2] >= nums1[p1]){
                nums1[curr] = nums2[p2];
                curr--;
                p2--;
            } else if(nums1[p1] > nums2[p2]){
                nums1[curr] = nums1[p1];
                curr--;
                p1--;
            }
        }
        
        while(p2 >= 0){
            nums1[curr] = nums2[p2];
            curr--;
            p2--;
        }
    }
}
