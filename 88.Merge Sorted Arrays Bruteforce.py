#Using python's inbuilt function.
#Time Complexity : O(m+nLog(m+n))
#Space Complexity : 1
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n==0:
            return nums1
        for i in range(n):
            nums1.pop()
        print(nums1)

        for i in range(n):
            nums1.append(nums2[i])
        nums1.sort()