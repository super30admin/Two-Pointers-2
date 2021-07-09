// Time complexity: O(m+n).
// Space complexity: O(1).
// Did this code run on leetcode: Yes

class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // starting from end. 
        int k = nums1.length - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            // if num at nums1 is greater than num at nums2, placing it at end
            if (nums1[m] > nums2[n]) {
                nums1[k--] = nums1[m--];
            }
            // else placing the num at nums2 at end.
            else {
                nums1[k--] = nums2[n--]; 
            }
        }
        
        // checking if there are more elements in any of the arrays.
        while(m>=0){
            nums1[k--] = nums1[m--];
        }
        
        while(n>=0){
            nums1[k--] = nums2[n--];
        }
        
    }
}