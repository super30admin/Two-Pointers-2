// Time complexity - O(m+n)
// Space complexity - O(1)

// Used two pointers at the last index of both the arrays and one pointer at the end of first array for insertion at right position. 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int  i = m-1; int j = n-1; int k = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;k--;
        }
    }
}
