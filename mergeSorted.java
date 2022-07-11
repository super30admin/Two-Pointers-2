//Time Complexity: O(n).
//Space Complexity: O(1).
//The approach here is to understand the three pointer approach and that you can solve using the three pointer approach. 


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1.length == 0)
            return;
        
        int l1p = m - 1;
        int l2p = n - 1;
        int l3p = (m+n) - 1;
        
        
        while(l1p >= 0 && l2p >= 0){
            if(nums1[l1p] >= nums2[l2p])
            {
                nums1[l3p] = nums1[l1p];
                l1p--;
            }
            else
            {
                nums1[l3p] = nums2[l2p];
                l2p--;
            }
                
            l3p--;
        }
        
        while(l2p >= 0){
            nums1[l3p] = nums2[l2p];
            l3p--;
            l2p--;
        }
    }
}