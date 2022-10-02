// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//I will be using 3 pointers and start inserting from the end of the nums1 array

public class MergeArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = (m + n - 1);
        
        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1 -= 1;
            } else {
                nums1[p3] = nums2[p2];
                p2 -= 1;
            }
            p3 -= 1;
        }
        
        while(p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2 -= 1;
            p3 -= 1;
        }
    }
}
