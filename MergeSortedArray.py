# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/
# Approach: 2 pointer

# In this approach we will maintain 3 ponters pointing to the the element just before 0 in nums1(p1), last element of nums2(p2) and last element of nums1(i) respectivly. Reason behind adopting this logic is last len(nums2) elements of nums1 array are 0. That means there is no fear of losing their values if they are replaced and as we know the array need to be sorted, replaced elements should be the largest from both the arrays.

# So we will compare p1 and p2 and the lagest of them will replace the value at nums1[i] i.e. 0 (See. No fear of losing that value). After replacing we will move p1 or p2 back depending from where the value is replaced and also move i back so that new value can be placed at that place.

# Time complexity: O(m+n)
# Space complexity: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums1 == None or len(nums1) == 0:
            return
        
        i = m + n - 1
        p1 = m - 1
        p2 = n - 1
        
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[i] = nums1[p1]
                p1 -= 1
            else:
                nums1[i] = nums2[p2]
                p2 -= 1
                
            i -= 1
            
        while p2 >= 0:
            nums1[i] = nums2[p2]
            p2 -= 1
            i  -= 1
        
        