// Time Complexity : O(m+n) as we are iterating over the two arrays once
// Space Complexity : O(1) since no auxiliary data structure is used
// Did this code successfully run on Leetcode :yes
// Your code here along with comments explaining your approach
class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int left = 0;
        int right = 0;
        int maxLen = nums1.length;

        if(maxLen == n){
            for(int i =0; i< n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }

        while(left < maxLen && right < n){
            //calculate the correct position
            left = 0;
            while(left < maxLen && left != m-1 && nums1[left] <= nums2[right]){
                left++;
            }
            //insert at m
            nums1[m] = nums2[right];
            //now adjust until everything is at correct position
            while(m < maxLen && left < maxLen && nums1[m]<= nums1[left] && left < m){
                swap(m, left, nums1);
                left++;
            }
            m++;
            right++;
        }
    }

    private void swap(int i, int j, int[] nums1){
        int temp = nums1[i];
        nums1[i] = nums1[j];
        nums1[j] = temp;
    }
}