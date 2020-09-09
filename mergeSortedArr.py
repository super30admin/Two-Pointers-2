# // Time Complexity : O(n+m)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Problems? No

# // Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #set pointers for nums1 and nums2, at the end
        a, b = m-1, n-1
        #set index of nums1 at the end
        i = m+n-1
        
        while a>=0 and b>= 0:
            
            if nums1[a] < nums2[b]:
                nums1[i] = nums2[b]
                b -= 1
            else:
                nums1[i] = nums1[a]
                a -=1
            i-=1
            
        #add missing elements from nums2
        nums1[:b+1] = nums2[:b+1]
        
        