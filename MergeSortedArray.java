// Time Complexity: O(m+n) where m and n are the sizes of the 2 arrays
// Space complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1= m-1, end = m+n-1, idx2= n-1;
       
        while(idx1>=0 && idx2>=0)
        { 
            if(nums1[idx1]>nums2[idx2])
            {
                nums1[end] = nums1[idx1];
                idx1--;
                end--;
            }
            else
            {
                nums1[end]=nums2[idx2];
                idx2--;
                end--;
            }
            
            
        }
       
            while(idx2>=0)
            { nums1[end]=nums2[idx2];
              end--; idx2--;
            }
        
    }
}