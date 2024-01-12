# Problem: Merge Sorted Array
#time complexity: O(m+n)
#space complexity: O(1)
#Approach: Two pointers

#1. Initialize three pointers i, j and k at m-1, n-1 and m+n-1 respectively.
#2. Iterate through the array and compare the elements at ith and jth index.
#3. If nums1[i] > nums2[j], then replace the element at kth index with the element at ith index.
#4. Else replace the element at kth index with the element at jth index.
#5. Decrement i, j and k by 1.
#6. If j >= 0, then replace the element at kth index with the element at jth index.
#7. Decrement j and k by 1.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i, j, k = m-1, n-1, m+n-1
        
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1
        
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1