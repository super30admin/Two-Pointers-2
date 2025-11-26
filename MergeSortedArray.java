// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p1 >= 0 && p2 >=0){
            if(nums2[p2] > nums1[p1]){
                nums1[p3] = nums2[p2];
                p2--;
            }else{
                nums1[p3] = nums1[p1];
                p1--;
            }
            p3--;
        }
        while(p2 >= 0){//copy rest of nums2 to nums1
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}

