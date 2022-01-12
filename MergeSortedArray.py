# Time Complexity :
# O(m+n)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english
# I have used three pointers to solve this problem.
# First pointer pointing to last valid element of nums1 array.
# Second pointer pointing to last element of nums2 array.
# Third pointer pointing to last element of nums1 array. 

# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # declaring three pointers
        i = m-1
        j = n-1
        k = len(nums1)-1
        
        while(i>=0 and j>=0):
            if(nums1[i]<nums2[j]):
                nums1[k] = nums2[j]
                j -= 1
                k -= 1
            else:
                nums1[k] = nums1[i]
                i -= 1
                k -= 1
                
        while(j>=0):
            nums1[k] = nums2[j]
            j -= 1
            k -= 1