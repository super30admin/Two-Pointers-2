package TwoPointers2;

/*S30 Big N Problem #37 {Easy } 
you are given 2 sorted arrays nums1 and nums2, you have to merge nums1 and nums2 as one sorted array.

Note:
The number of elements initialized in nums1 and nums2 are m and n respectively
also it is given that nums1 has enough space so that it can hold additional elements from nums2. 

Example:
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
Output: [1,2,2,3,5,6]
Source Link: https://leetcode.com/problems/merge-sorted-array/
    -------------------------------------------------------------------------------------------------------
    Time complexity : o(n+m) 
    space complexity: o(1) 
    Did this code run successfully in leetcode : yes
    problems faces : no*/
public class MergeSortedArray {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int pointer1 = m-1;
        int pointer2 = n-1;
        int i = m+n-1;
        
        while(pointer1>=0 && pointer2>=0)
        {
            if(nums1[pointer1] > nums2[pointer2])
             {
                nums1[i] = nums1[pointer1];
                pointer1--;
              }else
              {
                  nums1[i] = nums2[pointer2];
                  pointer2--;
              }
            
            i--;
        }
        while(pointer2>=0)
        {
            nums1[i] = nums2[pointer2];
            pointer2--;i--;
        }
        
    }

}
