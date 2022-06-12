class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        Approach: Start two pointers at the end of array, compare those and move larger elements to
        the end of the larged list. If your larger list pointer moves out of bounds, copy all ele
        from smaller list to larger
        if smaller list pointer goes out of bound you are done, terminate the algo
        
        TC O(m+n) SC O(1)
        Works in Leetcode : Yes
        https://leetcode.com/problems/merge-sorted-array/
        """
        
        p1, p2, loc = m-1,  n-1, m+n-1
        
        while p1 > -1 and p2 > -1:
            if nums1[p1] > nums2[p2]:
                nums1[loc] = nums1[p1]
                p1-=1
            else:
                nums1[loc] = nums2[p2]
                p2-=1
            loc-=1
        
        while p2 > -1:
            nums1[loc] = nums2[p2]
            p2-=1
            loc-=1

