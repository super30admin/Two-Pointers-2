# // Time Complexity : O(m+n) for 2 arrays
# // Space Complexity :O(1) since no additional space is used
# // Did this code successfully run on Leetcode :Yes
# // Three line explanation of solution in plain english
#We have 2 sorted arrays with, main arrays  0's at the end of the array. We can use 2 pointers for main array and 1 pointer for 2nd array.
# we will fix the 2 pointers on the last elements and the 3rd pointer on the last 0. We compare for each number till our pointers reach 0.
# we also need to take care of the boundary condition where array 2 was compared but all elements were not copied to nums1.

# // Your code here along with comments explaining your approach
class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #initialize 2 points, 1st in nums1 on last non zero number and 2nd on last number of nums2
        p1 = m-1
        p2 = n-1
        idx = len(nums1)-1              # initialize a 3rd pointer to store the output
        while p1>=0 and p2>=0 :         # move the graeter number at the index location
            if nums1[p1] <= nums2[p2]:
                nums1[idx] = nums2[p2]
                p2-=1
            else:
                nums1[idx] = nums1[p1]
                p1-=1
            idx -=1

        while p2 >= 0: #[4,5,6,0,0,0] and [1,2,3]
            nums1[idx] = nums2[p2]      # case where there are still elements present in nums2
            p2 -= 1
            idx -=1
