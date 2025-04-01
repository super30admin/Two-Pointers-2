"""
Approach:
Here we are 3 pointers. One at the m-1, other at n-1 and one to insert the elements into nums1 from the end. so m+n -1

if (nums1[p1] > nums2[p2]) then we add the nums1[p1] value to the nums1 using end index and we decrement both p1 and end pointer
if (nums1[p1] < nums2[p2]) then we add the nums2[p2] value to the nums1 using end index and we decrement both p2 and end pointer
we will iterate till p1 and p2 out of bound.
If elements nums1 are gretaer than nums2, then nums1 will be outof bound. so we are having another loop to add the nums2 elements to nums1


T.c: O(m+n)

S.c: O(1)

Passed in leetcode: Yes

Any difficulties: Initially tried with taking pointers from the start, because of that making the nums2 array unsorted. so choosed taking from m,n for nums1 and num2

"""
from typing import List
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> List[int]:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m -1
        p2 = n -1
        end = m + n - 1
        while(p1 >= 0  and  p2 >=0 ):
            if(nums1[p1] > nums2[p2]):
                nums1[end] = nums1[p1]
                p1 -= 1
            else:
                nums1[end] = nums2[p2]
                p2 -= 1
            end -=1
        while p2 >= 0:
            nums1[end] = nums2[p2]
            p2 -= 1
            end -= 1
        return nums1

sol = Solution()
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
print(sol.merge(nums1,m,nums2,n))
                

        