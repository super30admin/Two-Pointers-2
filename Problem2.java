// Time Complexity : O(m + n) as it will traverse either left or down until element is found
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2.length == 0){
            return;
        }

        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while(p2 >= 0 && p1 >= 0){
            if(nums2[p2] > nums1[p1]){
                nums1[p3] = nums2[p2];
                p2--;
            }else{
                nums1[p3] = nums1[p1];
                p1--;
            }
            p3--;
        }

        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }

    }
}
