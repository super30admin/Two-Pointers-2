// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0)
            return;
        
        int n1_ptr=m-1;
        int n2_ptr=n-1;
        int cur_ptr=nums1.length-1;
        
        while(cur_ptr>=0 && n1_ptr>=0 && n2_ptr>=0)
        {
                if(nums2[n2_ptr]>nums1[n1_ptr])
                {
                    nums1[cur_ptr]=nums2[n2_ptr];
                    n2_ptr--;
                }
                else if(nums2[n2_ptr]<=nums1[n1_ptr])
                {
                    nums1[cur_ptr]=nums1[n1_ptr];
                    n1_ptr--;
                }
            
            cur_ptr--;
        }

        if(n1_ptr<0)
        {
            while(cur_ptr>=0 && n2_ptr>=0)
            {
                nums1[cur_ptr]=nums2[n2_ptr];
                cur_ptr--;
                n2_ptr--;
            }
        }else if(n2_ptr<0)
        {
            while(cur_ptr>=0 && n1_ptr>=0)
            {
                nums1[cur_ptr]=nums1[n1_ptr];
                cur_ptr--;
                n1_ptr--;
            }
        }
    }
}

