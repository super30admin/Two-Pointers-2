// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0)
            return;
        
        int ptr1 = m-1, ptr2 = n-1, current = m+n-1;
        
        while(ptr1 >= 0 && ptr2 >=0){
            //check is its greater
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[current] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[current] = nums2[ptr2];
                ptr2--;
            }
            
            current--;
        }
        
        while(ptr2 >=0){
            nums1[current] = nums2[ptr2];
            current--;
            ptr2--;
        }
    }
}
