'''// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach
'''


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        
        """
        if nums1==0 or nums2==0 or len(nums1)==0 or len(nums2)==0:
            return nums1
        
        i=m-1
        j=n-1
        k=m+n-1
        
        
        while(i>=0 and j>=0 ):
        
            if (nums1[i]>nums2[j]):
                
                nums1[k]=nums1[i]
                i-=1
                
            else:   
                nums1[k]=nums2[j]
                j-=1
            k-=1   
            
        while(j>=0):
            nums1[k]=nums2[j]
            k-=1
            j-=1
                
        return nums1
