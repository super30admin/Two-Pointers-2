/** Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
* Time complexity O(N). space complexity O(1)
* Code submitted on leetcode
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        }
        if (nums2 == null || nums2.length == 0) {
            return;
        }
        int j = nums1.length-1, p2 = nums2.length-1;
        int p1 = j-p2 -1;
        while(p2>=0 && p1 >= 0){
            if (nums2[p2] >= nums1[p1]) {
                nums1[j] = nums2[p2];
                j--;
                p2 --;
            }
            else if (nums1[p1] >= nums2[p2]) {
                nums1[j] = nums1[p1];
                j--;
                p1 --;
            }
        }
            while (p2 >= 0) {
                nums1[j] = nums2[p2];
                j--;
                p2 --;
            }
        
    }
}
