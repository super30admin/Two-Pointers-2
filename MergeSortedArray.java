// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

//here, we'll chcek the elment from the back, greater number among two strings will get added at the end of the first array. and we'll decrease the pointers by 1.

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1 == null || nums1.length == 0) return;

        int k = nums1.length-1;
        int i = m-1, j = n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // adding remaining element of the nums2 in nums1.
        // we don't need to add the remaining element of the nums1, because it's already present in array in sorted fashion.
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return;
    }
}