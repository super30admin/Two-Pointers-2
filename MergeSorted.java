//Time complexity: O(m+n)
//Space complexity: O(1)
//Executed on leetcode.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 =m-1, n2= n-1, p = m+n-1;
        while(n1>=0 && n2>=0)
        {            
            if(nums1[n1]>=nums2[n2])
            {
                nums1[p] = nums1[n1];       //As the arrays are sorted comparing 2 arrays from behind and adding the largest element to the index at last and decrementing the pointer.
                n1--;
                p--;
            }
            else
            {
                nums1[p] = nums2[n2];
                n2--;
                p--;
            }
        }
        
        while(n2>=0)
        {
            nums1[n2]=nums2[n2];
            n2--;
        }
    }
}