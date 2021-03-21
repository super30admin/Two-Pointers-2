'''
TC: O(n)
SC: O(1) const
Leetcode: Success!
Problems: None
'''

class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Initialize the two pointers for each array
        pt1 = m - 1
        pt2 = n - 1
        # Initialize the i pointer to navigate through the extra space
        i = m + n - 1
        
        # Checking condition for pointers 1 and 2
        while(pt1>=0 and pt2>=0):
            
            # Check if the value at pt1 > value at pt2 
            # if True: assign the value at pt1 at the end since its sorted it will be the greatest value 
            if nums1[pt1] >= nums2[pt2]:
                nums1[i] = nums1[pt1]
                pt1 -= 1
            else:
            # else: assign the value at pt2 to last place in nums1
                nums1[i] = nums2[pt2]
                pt2 -= 1
            i -= 1
        
        # Check if the nums2 still has values if True: then keep adding the values to nums1 in the beginning 
        while(pt2>=0):
            nums1[i] = nums2[pt2]
            pt2 -= 1
            i -= 1
        print("Merged Array: ", nums1)
        pass

s = Solution()
nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
m = 3
n = 3
s.merge(nums1,m,nums2,n)
