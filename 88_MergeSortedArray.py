#  Time Complexity : O(m+n)
#  Space Complexity : O(1)


class Solution:
    def merge(self, nums1, m: int, nums2, n: int):
        p1 = m-1
        p2 = n-1
        idx = m+n-1
        while p1>=0 and p2>=0:
            if nums1[p1] > nums2[p2]:
                nums1[idx]= nums1[p1]
                p1 = p1 - 1
            else:
                nums1[idx]= nums2[p2]
                p2 = p2 - 1
            idx = idx - 1
            while p2>=0:
                nums1[idx]= nums2[p2]
                p2 = p2 - 1
                idx = idx - 1

obj = Solution()
print(obj.merge([1,2,3,0,0,0],3,[2,5,6],3))
