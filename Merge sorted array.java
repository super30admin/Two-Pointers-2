// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We keep the pointer p1 and p2 in the last elements of both the arrays. 
//Compare them and place the bigger one in the last index. Then move the pointer on the last index to the previous one, and move the index 
//which was at the bigger value as well to the element on its left. If there are elements left in the second array add them directly to the first array.

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int idx=m+n-1;

        while(p1>=0 && p2>=0)
        {
            if (nums1[p1]>nums2[p2])
            {
                nums1[idx]=nums1[p1];
                p1--;
            }
            else
            {
                nums1[idx]=nums2[p2];
                p2--;
            }

            

            idx--;
        }

        while(p2>=0)
        {
            nums1[idx]=nums2[p2];
            idx--;
            p2--;
        }
    }
}