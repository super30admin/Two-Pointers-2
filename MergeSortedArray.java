/*
This approach merges the arrays, by starting from the numerical end of both arrays. It 
checks for the greater elements among both arrays, and starts placing them starting from
the end of the first array. This eventually fills up all the zeroes, and sorts the combined
array as well

Did this code run on leetcode: Yes
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int idx = nums1.length - 1;
        int idx1 = m - 1;
        int idx2 = n - 1;
        
        while(idx1 >= 0 && idx2 >= 0)
        {
            
            if(nums1[idx1] > nums2[idx2])
            {
                nums1[idx--] = nums1[idx1--];
            }
            else
            {
                nums1[idx--] = nums2[idx2--];
            }
        }
        //If the first array sorts itself and there are still elements left in the second array, we put them all in the combined array
        while(idx2 >= 0)
        {
            nums1[idx--] = nums2[idx2--];
        }
        
    }
}