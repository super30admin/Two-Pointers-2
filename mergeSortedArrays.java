
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int count = m+n-1;
        m--;
        n--;

        while(m>=0 && n>=0)
        {
            if(nums1[m]>nums2[n])
            {
                nums1[count--] = nums1[m--];
            }
            else
            {
                nums1[count--] = nums2[n--];
            }
        }

        while(n>=0)
        {
            nums1[count--] = nums2[n--];
        }

    }
}
