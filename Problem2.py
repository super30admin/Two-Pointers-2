# Time Complexity: O(N)
# Space Complexity: O(1)
# Leetcode all test cases passed: Yes
# Any Difficulties: No, I tried the brute force which was taking O(n log n) time and then optimized     using two pointer from left and then was looking to optimize more when I saw the right side two       pointer in solution

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #Brute Force:
        # k=0
        # for i in range(m,m+n):
        #     nums1[i] = nums2[k]
        #     k+=1
        # return nums1.sort()
        
        left = m-1
        right = n-1
        pointer = m+n-1
        while left>=0 and right>=0:
            if nums1[left] < nums2[right]:          # Taking advantage of the fact that nums1 and 2 are sorted and has the maximum value on the right side respectively
                nums1[pointer] = nums2[right]
                right -=1
            else:
                nums1[pointer] = nums1[left]
                left -=1
            pointer -=1
        nums1[:right+1] = nums2[:right+1]
            
    
    
