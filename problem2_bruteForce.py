"""
Time Complexity : O(n) + O(m+n)log(m_n)
Space Complexity : O(1) No new data structure is used
Did this code successfully run on Leetcode :
Three line explanation of solution in plain english:
First append the nums2 to nums1 and then sort nums1

// Your code here along with comments explaining your approach
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #Brute force
        
        #Append Elements of nums2 to nums 1 
        count = 0
        for i in range(m,len(nums1)):
            nums1[i].append(nums2[count])
            count += 1
        
        #Sort the nums 1
        nums1.sort()