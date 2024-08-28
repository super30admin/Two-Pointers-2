// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Compare the largest elements of both array and fill the empty spaces in first array. If nums2 completes first -> gives sorted array. if nums1 runs out first -> copy remaining elements of nums2 to nums1 from idx


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; int p2=n-1;
        int idx = m+n-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--; idx--;
            } else{
                nums1[idx] = nums2[p2];
                p2--; idx--;
            }
        }
        while(p1<0 && p2>=0){
            nums1[idx--] = nums2[p2--];
        }
    }
}