#O(M+N) TIME AND O(M+N) SPACE
class Solution:
    def merge(self, nums1, m, nums2, n):
        nums1_duplicate = nums1[:m]
        nums1[:] = []
        p1 = 0
        p2 = 0
        while p1 < m and p2 < n:
            if nums1_duplicate[p1] < nums2[p2]:
                nums1.append(nums1_duplicate[p1])
                p1 += 1
            else:
                nums1.append(nums2[p2])
                p2 += 1
        while p1 < m :
            nums1.append(nums1_duplicate[p1])
            p1 += 1
        while p2 < n :
            nums1.append(nums2[p2])
            p2 += 1

s = Solution()
s.merge([1,2,3,0,0,0],3,[2,5,6],3)
        