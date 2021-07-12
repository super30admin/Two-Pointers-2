#Time: O(m+n)
#Space: O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        We start from the rear ends of the lists and keep on updating nums1 with element that has bigger or greater value.
        Do not return anything, modify nums1 in-place instead.
        """
        curr = len(nums1)-1
        p1 = m-1
        p2 = n-1
        while(p1>-1 and p2>-1 and curr>-1):
            if nums1[p1]<=nums2[p2]:
                nums1[curr]=nums2[p2]
                p2-=1
            else:
                nums1[curr]=nums1[p1]
                p1-=1
            curr-=1
        if p2!=-1:
            while(p2>-1 and curr>-1):
                nums1[curr]=nums2[p2]
                p2-=1
                curr-=1
        if p1!=-1:
            while(p1>-1 and curr>-1):
                nums1[curr]=nums1[p1]
                p1-=1
                curr-=1
        
        