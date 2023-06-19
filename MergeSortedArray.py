# Time Complexity : O(m+n)
# Space Complexity : O(1)

# The code ran on LeetCode

# Maintain 3 pointers and update the elements of nums1 from the end. 

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        idx = m+n-1; p1 = m-1; p2 = n-1

        while p2 >= 0 and p1 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1-=1
                
            else:
                nums1[idx] = nums2[p2]
                p2-=1
            
            idx-=1

        # Update nums1 using remaining elements in nums2
        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2-=1
            idx-=1
        