Remove Duplicates from Sorted Array II
Time complexcity : 0(n)
space complexcity : 0(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        for n in nums:
            if i < 2 or n > nums[i-2]:
                nums[i] = n
                i += 1
        return i

Merge Sorted Array
Time complexcity :0(m+n)
space complexcity : 0(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums1)==0 or len(nums2)==0:
            return 
        p1 = m - 1
        p2 = n - 1
        # Create a pointer for the end of the resulting array
        p = m + n - 1
        
        # Compare the values of p1 and p2 and place the larger value at the end of the resulting array
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] < nums2[p2]:
                nums1[p] = nums2[p2]
                p2 -= 1
            else:
                nums1[p] = nums1[p1]
                p1 -= 1
            p -= 1
        
        # If there are still elements in nums2, add them to the beginning of the resulting array
        nums1[:p2 + 1] = nums2[:p2 + 1]

Search a 2D Matrix II
TC:)(m+n)
SC:0(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # set initial position to top right corner
        row, col = 0, len(matrix[0])-1
        
        while row < len(matrix) and col >= 0:
            if matrix[row][col] == target:
                # target found
                return True
            elif matrix[row][col] < target:
                # current element is smaller than target, move down one row
                row += 1
            else:
                # current element is greater than target, move left one column
                col -= 1
                
        # target not found
        return False