#Time Complexity : O(m+n)

#Space Complexity : O(1) 

#Did this code successfully run on Leetcode : Yes

#Any problem you faced while coding this :None

# =============================================================================
# Solution: Take 3 pointers i,k,j. Intialize i at m+n-1 index because according to required result we can have m+n elements
#in the ouput. Point k at last mth position in first array and j at nth position in second array and now start comparing from last index of the arrays.
#and decrement the pointers. If k index is out of bound then simply put elements of 2nd array in to first array.
# =============================================================================


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i = m + n - 1
        k = m - 1
        j = n - 1
        while(j >= 0 and k >= 0):
            if(nums1[k] < nums2[j] ):
                nums1[i] = nums2[j]
                j -= 1
            else:
                nums1[i] = nums1[k]
                k -= 1
            i -= 1
        # return nums1
        nums1[:j +1] = nums2[:j+1]
            
        
            
                
            
            
        
        