/**

Leetcode: https://leetcode.com/problems/merge-sorted-array/

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]


logic : totalelement = m + n
Collabedit: http://collabedit.com/4rum4
**/


class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int pointer1 = 0;
        int pointer2 = 0;
        int index = 0;
        
        int output[] = new int[m+n];
        
        while(pointer1 < m || pointer2 < n)
        {
            if(pointer1 < m && pointer2 < n)
            {
                if( nums1[pointer1] <= nums2[pointer2])
                {
                    output[index++] = nums1[pointer1++];
                }
                else
                {
                    output[index++] = nums2[pointer2++];
                }
            }
            else if( pointer1 < m)
            {
                output[index++] = nums1[pointer1++];
            }
            else
            {
                output[index++] = nums2[pointer2++];
            }
        }
        
        for(int i =0; i < m + n; i++)
            nums1[i] = output[i];
        
        
    }
}