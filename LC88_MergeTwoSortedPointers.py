
"""
Merge two sorted arrays
If we start from the beginning, there will be cases of faliure where we are either losing the order of elements in sorted arrays
or we are losing the way we access these elements

SO we maintain a pointer at the last valid element of the first array and at the last element of the second array and a pointer h which 
will traverse from the last to the first of the first array 

nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
            P1     h                       P2

Output: [1,2,2,3,5,6]
"""


class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.

        """
        # l1 = len(nums1)
        # l2 = len(nums2)
        p1 = m-1
        p2 = n-1
        
        h = m+n-1

        # for h in range(l1-1,0,-1):
        while(p1>=0 and p2>=0):
            if nums1[p1]>nums2[p2]:
                nums1[h]= nums1[p1]
                p1-=1
                h-=1

            else:
                nums1[h]=nums2[p2] 
                p2-=1
                h-=1
        
        while(p2>0):
            nums1[h]=nums2[p2] 
            p2-=1
            h-=1
        return nums1


object = Solution()

nums1 = [1,2,3,0,0,0] 
m = 3
nums2 = [2,5,6]
n = 3
final = object.merge(nums1,m, nums2, n)
print('output:',final)
expected = [1,2,2,3,5,6]
print('Expected', expected)

                


        
     