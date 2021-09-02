// Time Complexity: O(m+n-1) we fill num1 all values with num1 and num2 values
// Space Complexity: O(1) no additional data structure
// Did you complete it on leet code: Yes
// Any problems faced: No

// Write your approach here
// Idea here is to see that total number of spaces are equal to sum of nums 1 and nums 2 length.
// So we can start filling maximum value at thelast position, and whichever array's element filled the last position is moved towards start.
// when there are still elements remaining in 2nd array we iterate to keep filling them in nums1.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m+n-1; int end1 = m-1; int end2 = n-1;
        while(end1>=0 && end2>=0) {
            if(nums1[end1] > nums2[end2]){
                nums1[end--] = nums1[end1--];
            } else {
                nums1[end--] = nums2[end2--];
            }
        }
        while(end2>=0) {
            nums1[end--] = nums2[end2--];
        }
    }
}