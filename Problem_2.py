#Time Complexity = O(m+n)
# Space Complexity = O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        first = m - 1
        second = n - 1
        index = len(nums1)-1

        while (first >= 0 and second >= 0):
            if nums1[first]>=nums2[second]:
                nums1[index] = nums1[first]
                index = index - 1
                first = first - 1
            
            elif nums1[first]<nums2[second]:
                nums1[index] = nums2[second]
                index = index - 1
                second = second - 1
        

        while second >=0 :
            nums1[index] = nums2[second]
            second = second - 1
            index = index - 1            



        
        