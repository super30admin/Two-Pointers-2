// Time Complexity: O(n)
// Space Complexity: O(1)

/*
 * traverse through the array and only keep the elements occuring
 * twice. then replace the elements with the next unique element
 * twice. return the slow pointer for length.
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = m+n-1;
        int second = n-1;
        while (left >= 0 && second >= 0){
            if(nums2[second] > nums1[left]){
                nums1[right] = nums2[second];
                second--;
            }
            else{
                nums1[right] = nums1[left];
                left--;
            }
            right--;
        }
        while(second >= 0){
            nums1[right] = nums2[second];
            second--;
            right--;
        }
    }
}