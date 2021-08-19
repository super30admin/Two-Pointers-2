//Time complexity: O(m+n)
//Space complexity: O(1)
//running on leetcode: yes
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1==null && nums2==null)
        {
            return;
        }
        //take 3 pointers
        //i is nums1 length, j is nums2 length, k is last index of nums1 array which is size of m+n
        int i=m-1, j=n-1, k=m+n-1;
        while (i>=0 && j>=0)
        {
            if (nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        while (j>=0)
        {
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
