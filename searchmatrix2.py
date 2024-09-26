
# Time Complexity : O(M+N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
#Start comparing elements from the end of the two lists 
#Add the element which is higher at the end of the first list
#This modifies the nums1 in place

# Your code here along with comments explaining your approach


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        
        i = m -1
        j = n -1
        k = m+n-1
        
        while i>=0 and j>=0:
            if nums2[j] >= nums1[i]:
                nums1[k] = nums2[j]
                j = j-1
                
            else:
                nums1[k] = nums1[i]
                i=i-1
                
            k = k-1
            
        while i>=0:
            nums1[k] = nums1[i]
            k = k-1
            i = i-1
            
        while j>=0:
            nums1[k] = nums2[j]
            k=k-1
            j = j-1
                
            