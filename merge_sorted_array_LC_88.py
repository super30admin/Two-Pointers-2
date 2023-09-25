#used three pointers two at nums1 and 1 at nums 2. Therefore TC: O(m+n) SC: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if not nums1 or len(nums1)==0:
            return False
        p1=m-1
        p2=n-1
        p3=len(nums1)-1

        while p1>=0 and p2>=0:
            nums1[p3] = max(nums1[p1],nums2[p2])
            if nums1[p1]>nums2[p2]:
                p1-=1
            else:
                p2-=1
            p3-=1

        while p2>=0:
            nums1[p3]=nums2[p2]
            p2-=1
            p3-=1   
