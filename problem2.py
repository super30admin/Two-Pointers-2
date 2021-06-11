class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        right1 = m+n-1
        right2 = n-1
        mid = m-1
        
        while mid >=0 and right2 >=0:
            if nums1[mid] < nums2[right2]:
                nums1[right1] = nums2[right2]
                right2 -=1
            else:
                nums1[right1] = nums1[mid]
                mid -= 1
            right1-=1
        
        while right2 >=0:
            nums1[right1] = nums2[right2]
            right2 -=1
            right1-=1
            
        
#Time complexity is O(m+n)
#Space complexity is O(1)
#3 pointers are used to track the highest value between 2 arrays and point of insertion
        