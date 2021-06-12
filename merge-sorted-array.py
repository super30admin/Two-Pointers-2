# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Take two pointer at the end of the two lists that we have to merge
        p1 = m - 1
        p2 = n - 1
        
        #Take a current pointer at the end of nums1 array to check which is bigger of the two and keep replacing
        for current in range(m + n - 1, -1, -1):
            # Break when there are no longer any elements in nums2 which is denoted by p2 pointer
            if p2 < 0:
                break
            
            # Check if element in nums1 or nums2 is bigger
            # if is important to check the condition p1>=0 because of the test case [2,0] and [1]
            # If it is bigger, place at the position of current which is towards the end of nums1
            # Decrement the pointer of the nums1 array to compare again
            if p1>= 0 and nums1[p1] > nums2[p2]:
                nums1[current] = nums1[p1]
                p1 -= 1
            
            # Check if element in nums1 or nums2 is bigger
            # Here we are using else because we want to include the equal condition also
            # If it is bigger, place at the position of current which is towards the end of nums1
            # Decrement the pointer of the nums2 array to compare again
            else:
                nums1[current] = nums2[p2]
                p2 -= 1
                
        return nums1
        
            
            
        