#Merge Sorted Array
# Time complexity O(m+n)
# Space complexity -> O1
# Logic -> Start from updating the biggest elemnt in the correct place this way when we overwrite the bigger items 
# with the smaller items bigger items won't be lost as they will already be copied in the correct position 

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        smallListPointer = n-1
        bigListpointer = m-1
        finalListPOinter = len(nums1)-1

        while smallListPointer >=0 and bigListpointer>=0:
            nums1item = nums1[bigListpointer]
            nums2Item = nums2[smallListPointer]
            if nums1item > nums2Item:
                nums1[finalListPOinter] = nums1item
                bigListpointer-=1
            else:
                nums1[finalListPOinter] = nums2Item
                smallListPointer-=1
            finalListPOinter-=1

        if bigListpointer == -1:
            while finalListPOinter >= 0:
                nums1[finalListPOinter] = nums2[smallListPointer]
                finalListPOinter-=1
                smallListPointer-=1

        