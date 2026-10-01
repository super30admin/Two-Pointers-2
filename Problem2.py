# LEETCODE PROBLEM : 88 MERGE SORTED ARRAY
# TIME COMPLEXITY: O(M+N) where M is the length of the first array and N is the length of second array
# SPACE COMPLEXITY: O(1) as we are not taking any extra space while doing the sort on the array


class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1,p2=m-1,n-1
        idx=m+n-1

        while p1>=0 and p2>=0:
            if nums2[p2]>nums1[p1]:
                nums1[idx]=nums2[p2]
                p2-=1
            else:
                nums1[idx]=nums1[p1]
                p1-=1
            idx-=1

        while p2>=0:
            nums1[idx]=nums2[p2]
            p2-=1
            idx-=1