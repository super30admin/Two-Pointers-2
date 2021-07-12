class Solution:
    def merge(self, nums1, m, nums2, n) :
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums1 == None or m == 0 or nums2 == None or n == 0:
            return 0
        p1 = m - 1
        p2 = n - 1
        p = m + n - 1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p -= 1
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
                p -= 1
        while p2 >= 0:
            nums1[p1] = nums2[p2]
            p -= 1
            p2 -= 1

sol=Solution()
nums1=[1,2,3,8,0,0,0]
m=4
nums2=[2,5,6]
n=3
sol.merge(nums1,m,nums2,n)
print nums1