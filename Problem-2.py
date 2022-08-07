#  88. Merge Sorted Array
'''
Leetcode all test cases passed: Yes
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        n is the length of nums
        Space Complexity: O(1)
        Time Complexity: O(n)
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        curr = len(nums1) - 1
        
        l = m - 1
        r = n - 1
        
        while curr >= 0:
            if r == -1:
                break
          
            
            if l >=0 and nums1[l] >= nums2[r]:
                nums1[curr] = nums1[l]
                l -= 1
            else:
                nums1[curr] = nums2[r]
                r -= 1
            curr -= 1

        return
                
