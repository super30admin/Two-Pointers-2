// Time Complexity
// O(m + n) — each element is processed at most once.

// Space Complexity
// O(1) — in-place merge without extra space.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int idx = m+n-1;
        while( p1 > -1 && p2 > -1){
            if(nums1[p1] < nums2[p2]){
                nums1[idx--] = nums2[p2--];
            }else {
                nums1[idx--] = nums1[p1--];
            }
        }
        while(p2 > -1){
           nums1[idx--] = nums2[p2--]; 
        } 
    }
}
