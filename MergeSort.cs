// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes

public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m -1;
        int mid = m+n -1;
        int n2 = n - 1;
        while(n1 >= 0 && n2 >= 0)
        {
            if(nums2[n2] > nums1[n1])
            {
                nums1[mid] = nums2[n2];
                n2--;                
            }
            else{
                nums1[mid] = nums1[n1];
                n1--;                
            }
            mid--;            
        }
        while(n2 >= 0)
            {
                nums1[mid] = nums2[n2];
                n2--;
                mid--;
            }
    }
}
