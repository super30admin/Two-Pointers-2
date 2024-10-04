// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// The approach uses two pointers, p1 for nums1 (initialized elements) and p2 for nums2, 
//starting from the end of both arrays. We compare elements from the back and place the larger one at the end of nums1, moving the pointers accordingly. 
//After processing both, if any elements remain in nums2, they are copied into nums1 as it already has the right elements from nums1.
public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {

        int p1=m-1, p2=n-1;
        int idx = m+n-1;

        while(p1>=0 && p2>=0)
        {
            if(nums2[p2]>nums1[p1]){
            nums1[idx] = nums2[p2];
            
            p2--;
            }else{
                nums1[idx]=nums1[p1];
                p1--;
            }
            idx--;
        }

        while(p2>=0){
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }
    }
}