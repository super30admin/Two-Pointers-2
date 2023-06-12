# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to compare l which refer to 0 and high 2 in accordance with m 1 and swap the l and m or m and h accordingly the list
# is sorted.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        temp=[]
        c=m+n-1
        p1=m-1
        p2=n-1
        while(p1>=0 and p2>=0):
            if(nums1[p1]<nums2[p2]):
                nums1[c]=nums2[p2]
                p2-=1
            else:
                nums1[c]=nums1[p1]
                p1-=1
            c-=1
        nums1[:p2+1]=nums2[:p2+1]

        return nums1