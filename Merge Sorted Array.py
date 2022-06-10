# time complexity is o(m + n), where m is number of elements needed to be compared in nums1 and n is the number of elements in nums2
# space complexity is o(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        [1,2,3,0,0,0]
        [2,5,6]
        """
        ind = len(nums1) -1
        p1 = m-1
        p2 = n-1
        while(p1 > -1 and p2 >-1):
            if(nums1[p1] > nums2[p2]):
                nums1[ind] = nums1[p1]
                p1 -=1 
            else:
                nums1[ind] = nums2[p2]
                p2 -= 1
            ind -= 1
        while(p2 > -1):
            nums1[ind] = nums2[p2]
            ind -= 1
            p2 -= 1
        
        