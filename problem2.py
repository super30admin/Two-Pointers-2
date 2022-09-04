'''
88. Merge Sorted Array

TIME COMPLEXITY: O(M+N)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
METHOD: Three pointer approach
DIFFICULTIES: Took a while to figure out the logic using the hint from the class
'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        n1 = len(nums1)
        n2 = len(nums2)
        p3 = n2-1
        p2 = n1 -1
        p1 = p2 - p3 -1
        
        while p3 >= 0:
            if p1 < 0:
                nums1[p2] = nums2[p3]
                p2 -=1
                p3-=1
                p1-=1
            
            elif nums2[p3] >= nums1[p1]:
                nums1[p2] = nums2[p3]
                p3 -=1
                p2-=1
            else:
                nums1[p2] = nums1[p1]
                p1 -=1
                p2-=1
        
