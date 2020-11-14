// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//started to merge from backwards till both the array elements have merged.

public class MergeTwoAortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int addIndex = nums1.length-1;
        int j = n-1;
        int i = m-1;

        while(j>=0 && i>=0){
            if(nums1[i] <= nums2[j]){
                nums1[addIndex] = nums2[j];
                j--;
            }
            else if(nums1[i] > nums2[j]){
                nums1[addIndex] = nums1[i];
                i--;
            }
            addIndex--;
        }
        while(j>=0){
            nums1[addIndex] = nums2[j];
            j--;
            addIndex--;
        }
    }
}
