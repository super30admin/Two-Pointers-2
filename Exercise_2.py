class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    
        one = m - 1
        two = n - 1
        
        # iterate through all the characters in nums1
        for i in reversed(range(m+n)):
            
            if two < 0:
                return
           
            if nums1[one] < nums2[two] or one < 0:
                nums1[i] = nums2[two]
                two -= 1
            else:
                nums1[i] = nums1[one]
                one -= 1