// Time Complexity :  O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= m-1, p2=n-1;
        int idx=m+n-1;

        while(p1 >=0 && p2 >=0 ){
            if(nums2[p2] > nums1[p1]) {
                nums1[idx] = nums2[p2];
                p2--;
            } else {
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }

        // 1) If both num1 and num2 pointer goes out of bounds, then we have a sorted array.
        // 2) If num1 goes out of bounds, then, we have elements in num2 and we just need to copy them over.
        // 3) If num2 goes out of bounds, then we have a sorted array.
        // Option 2) applies here.
        while(p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
        
    }
}