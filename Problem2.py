#Two Pointers 2
#Problem1 : https://leetcode.com/problems/merge-sorted-array/
#All test cases passed on Leetcode
#Time Complexity-O(N)
#Space Complexity-O(1)

class Solution:
    def merge(self, nums1, m, nums2, n) :
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
       #Take two pointers starting from last of both the lists 
        p1 = m - 1
        p2 = n - 1
        # set pointer for nums1
        # no of elements initialised currently are m and n , so the pointer in nums1 would be m+n-1 (since index started from O)
        p = m + n - 1
        
        while p1 >= 0 and p2 >= 0:
            #if nums2 element is greater than nums1 element at which pointers are currently pointed, we 'll assign that 'to the right side of the list
            if nums1[p1] < nums2[p2]:
                nums1[p] = nums2[p2]
                p2 -= 1
            else:
            #otherwise assign nums1 element to the right hand side
                nums1[p] =  nums1[p1]
                p1 -= 1
            p -= 1
        
        # add missing elements from nums2
        nums1[:p2 + 1] = nums2[:p2 + 1]
        
            
sol = Solution()
nums1=[1,2,3,0,0,0]
nums2=[2,5,6]
m=3
n=3
sol.merge(nums1, m, nums2, n)
print(nums1)



        
        















