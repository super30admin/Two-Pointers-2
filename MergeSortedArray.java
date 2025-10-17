// Time Complexity : O(m+n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach :  We have two pointers, both at end of each array. Basically, we compare two elements from both arrays and place the biggest
// one at the end of the array. Based on it, we move the pointers accordingly.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while(p1>=0 && p2>=0){ //until both arrays wont reach out of bounds
            if(nums1[p1] <= nums2[p2]){
                nums1[idx] = nums2[p2];//add the greater one from nums2 to nums1
                p2--;
                idx--;
            } else{
                nums1[idx] = nums1[p1];//shift the greater one to end pointer in nums1
                p1--;
                idx--;
            }
        }
        while(p2>=0){//if still elements are left in nums2, move to nums1
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}