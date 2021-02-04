// Time complexity (O(n + m))
// Works on leet code
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null){
            return;
        }
        int index = nums1.length - 1;
        int j = n - 1;
        int i = m - 1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                i = i - 1;
            }
            else{
                nums1[index] = nums2[j];
                j = j - 1;
            }
            index = index - 1;
        }

        while(j >= 0){
            nums1[index] = nums2[j];
            j = j - 1;
            index = index - 1;
        }
    }
}
