# Time Complexity : Add - O(m+n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
'''
1. I use three pointer i,j,k
2. i is positioned at the end of nums1, j is positioned at the end of nums2
3. k is positioned at the end of nums1.
'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        i = m -1
        j =  n - 1
        k = m + n - 1
        
        while (i >=0 and j >=0):
            
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i = i -1
            else:
                nums1[k] = nums2[j]
                j = j - 1
            
            k -= 1
            
        while j >=0 and k >= 0:
            
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
            
        print (nums1)            
        