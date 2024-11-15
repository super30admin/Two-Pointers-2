"Time Complexity is O(m+n)"
"Space Complexity is O(1)"

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        pointer1 = m-1
        pointer2 = n-1
        i = m + n - 1

        while(pointer1 >= 0 and pointer2 >= 0):
            if nums1[pointer1] > nums2[pointer2]:
                nums1[i] = nums1[pointer1]
                pointer1 = pointer1 - 1 
            else:
                nums1[i] = nums2[pointer2]
                pointer2 = pointer2 - 1
            i = i - 1
        
        while pointer2 >= 0:
            nums1[i] = nums2[pointer2]
            pointer2 = pointer2 - 1
            i = i - 1

        return nums1


        