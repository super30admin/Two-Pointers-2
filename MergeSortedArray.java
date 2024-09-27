// Time Complexity: O(m+n)
// Space COmplexity: (m)
class Solution {
 public void merge(int[] nums1, int m, int[] nums2, int n) {
     int[] nums = new int[m];
     for(int i=0; i<m; i++) {
         nums[i] = nums1[i];
     }

     int left = 0, right = 0, index=0;

     while(index<nums1.length) {
         if(left>=m) {
             nums1[index] = nums2[right++];
         } else if(right >=n) {
             nums1[index] = nums[left++];
         } else if(nums2[right]<nums[left]){
             nums1[index] = nums2[right++];
         } else {
             nums1[index] = nums[left++];
         }
         index++;
     }
 }
}

// Time COmplexity: O(m+n)
// Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1, right = n-1, index = nums1.length-1;

        while(index >=0) {
            if(left<0) {
                nums1[index] = nums2[right--];
            } else if(right<0) {
                nums1[index] = nums1[left--];
            } else if(nums1[left] > nums2[right]) {
                nums1[index] = nums1[left--];
            } else {
                nums1[index] = nums2[right--];
            }

            index--;
        }

    }
}