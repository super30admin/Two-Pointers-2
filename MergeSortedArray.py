#88. Merge Sorted Array
"""
Time Complexity : O(n)
Space Complexity : O(1)
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        l = m - 1
        h = m+n - 1
        i = n - 1
        #base
            
        
        #logic
        if m>0:
            while(i >= 0 and l>= 0):
                #print(l, h, i)
                if nums2[i] >= nums1[l]:
                    nums1[h] = nums2[i]
                    i-=1
                    h-=1

                elif nums2[i] < nums1[l]:
                    nums1[h] = nums1[l]
                    h-=1
                    l-=1
            if i!=-1:
                for x in range(0, h+1):
                    nums1[x] = nums2[x]
        else:
            for i in range(0, n):
                #print(nums1[i], nums2[i])
                nums1[i] = nums2[i]
                
        #print("e",nums1)
