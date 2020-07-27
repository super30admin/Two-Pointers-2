// Time Complexity : O(n)
// Space Complexity : O(1)

// Approach:
//     Compare the last element of both the arrays, & which ever is greater insert at the end of bigger array.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2 == null || nums2.length<1) return;
        
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}