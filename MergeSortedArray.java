/**
 * TC: O(n) SC: O(1)
 * Approach: Compare from the end of both the arrays element and place at the end of the 1st array whichever is largest. 
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pm = m-1;
        int pn = n-1;
        int p = m+n-1;
        while(p >= 0 && pm >= 0 && pn >= 0){
            if(nums2[pn] > nums1[pm]){
                nums1[p] = nums2[pn];
                pn--;
            } else{
                nums1[p] = nums1[pm];
                pm--;
            }
            p--;
        }
        if(pm >= 0){
            while(pm >= 0 && p >= 0){
                nums1[p] = nums1[pm];
                pm--;
                p--;
            }
        }
        if(pn >= 0){
            while(pn >= 0 && p >= 0){
                nums1[p] = nums2[pn];
                System.out.println(nums1[p]);
                pn--;
                p--;
            }
        }
        
    }
}