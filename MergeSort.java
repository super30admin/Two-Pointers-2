// Time Complexity : O(m + n)
// Space Complexity : O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //pointer to the last element of result array
        int k = m + n - 1;
        //pointer to the last element of nums1
        int i = m - 1;
        //pointer to the last element of nums2
        int j = n - 1;
        while(i >= 0 && j >= 0){
            //add the greater element of nums1 and nums2 to nums1[k]
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        //if there are remaining elements in nums2, add it to nums1
        while(j >= 0)
            nums1[k--] = nums2[j--];
    }
}