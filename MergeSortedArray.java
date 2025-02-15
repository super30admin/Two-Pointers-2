// Time Complexity : O(m+n) where m is the length of nums1 and n is length of  nums2
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// - Start from the end of both arrays
// - Compare the elements from both arrays and place the greater element at the end of the first array

// Your code here along with comments explaining your approach
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = nums1.length-1;
        int nums1Len = m-1;
        int nums2Len = n-1;

        while(nums1Len >= 0 && nums2Len >= 0){
            if(nums1[nums1Len] > nums2[nums2Len]){
                nums1[p1] = nums1[nums1Len];
                nums1Len--;
            }else{
                nums1[p1] = nums2[nums2Len];
                nums2Len--;
            }
            p1--;
        }

        while(nums2Len >= 0){
            nums1[p1] = nums2[nums2Len];
            nums2Len--;
            p1--;
        }
    }
}
