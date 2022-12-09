TC: O(m+n)
SC: O(1)

//https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = m-1;
        int pt2 = n-1;
        int idx = m+n-1;
        while(pt1 >= 0 && pt2 >= 0){
            if(nums1[pt1] >= nums2[pt2]){
                nums1[idx] = nums1[pt1];
                pt1--;
            }else{
                nums1[idx] = nums2[pt2];
                pt2--;
            }
            idx--;
        }
        while(pt2>=0){
            nums1[idx] = nums2[pt2];
            idx--;pt2--;
        }
    }
}
