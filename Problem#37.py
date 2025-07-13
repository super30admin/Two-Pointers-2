'''
88. Merge Sorted Array
LeetCode Problem Link: https://leetcode.com/problems/merge-sorted-array/
Problem Name: Merging of 2 arrays

Source Link: https://leetcode.com/problems/merge-sorted-array/
'''

# Time Complexity : O(m+n) for both approaches
# Space Complexity : O(m+n) for Brute Force Approach, O(1) for Two Pointer Approach
# Did this code successfully run on Leetcode : Yes, both approaches
# Any problem you faced while coding this : Yes, understanding how to merge two sorted arrays in-place without using extra space.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Brute Force Approach
        # Time Complexity: O((m+n)log(m+n))
        # Space Complexity: O(m+n)
        # nums1[m:] = nums2[:n] # humne nums1 ke last m elements ko nums2 ke n elements se replace kar diya (We replaced the last m elements of nums1 with the n elements of nums2)
        # nums1.sort() # phir humne nums1 ko sort kar diya (Then we sorted nums1)

        # Two Pointer Approach
        # Time Complexity: O(m+n)
        # Space Complexity: O(1)
        p1, p2 = m - 1, n - 1 # humne p1 ko nums1 ke last m elements par aur p2 ko nums2 ke last n elements par set kiya (We set p1 to the last m elements of nums1 and p2 to the last n elements of nums2)
        p3 = m + n - 1 # p3 ko humne nums1 ke last index par set kiya (We set p3 to the last index of nums1)
        while p1 >=0 and p2 >= 0: # hum while loop mein tab tak chalte hain jab tak p1 aur p2 dono >= 0 hain (We continue in the while loop as long as both p1 and p2 are >= 0)
            if nums2[p2] > nums1[p1]: # agar nums2 ka current element nums1 ke current element se bada hai (If the current element of nums2 is greater than the current element of nums1)
                nums1[p3] = nums2[p2] # toh hum nums1 ke last index par nums2 ka current element daal dete hain (then we place the current element of nums2 at the last index of nums1)
                p2 -= 1 # aur p2 ko ek kam kar dete hain (and decrement p2 by 1)
            else: # agar nums1 ka current element nums2 ke current element se bada hai (If the current element of nums1 is greater than the current element of nums2)
                nums1[p3] = nums1[p1] # toh hum nums1 ke last index par nums1 ka current element daal dete hain (then we place the current element of nums1 at the last index of nums1)
                p1 -= 1 # aur p1 ko ek kam kar dete hain (and decrement p1 by 1)
            p3 -= 1 # p3 ko bhi ek kam kar dete hain (We also decrement p3 by 1)
        while p2 >= 0: # agar p2 abhi bhi >= 0 hai (If p2 is still >= 0)
            # iska matlab hai ki nums2 ke elements abhi bhi nums1 mein nahi hain (This means that there are still elements of nums2 that are not in nums1)
            nums1[p3] = nums2[p2] # toh hum nums1 ke last index par nums2 ka current element daal dete hain (so we place the current element of nums2 at the last index of nums1)
            p2 -= 1 # aur p2 ko ek kam kar dete hain (and decrement p2 by 1)
            p3 -= 1 # p3 ko bhi ek kam kar dete hain (We also decrement p3 by 1)
        # Note:
        # We don't need to handle p3 because it will automatically be in the correct position after the loop.
        # No need to handle p1 because if p1 is still >= 0, it means all elements of nums2 are already placed correctly in nums1.
        # If p1 < 0, it means nums1 already has all its elements in place.
        # Thus, we don't need to do anything further.

