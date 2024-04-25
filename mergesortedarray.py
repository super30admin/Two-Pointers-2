
# // Time Complexity : O(n+m)
# // Space Complexity :O(n+m)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach

# take 2 pointers , and point them in the end of arrays , reason : we know for sure that end of either of the array will have , the end of sorted elemnt of full array 
#  compare and add highest element in the end if element 
#by the end of it we know that 'n' elemts are sorted in the end of the array , just copy the remaining elements to 1st part 

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        idx = m + n -1

        while p1 >= 0 and p2 >= 0 :
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
                idx -= 1
            else :
                nums1[idx] = nums2[p2]
                p2 -= 1
                idx -= 1

        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1

        return nums1