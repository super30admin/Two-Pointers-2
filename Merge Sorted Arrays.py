# Time: O(N+M)
# Space: O(1)


class Solution:
    def merge(self, nums1, m, nums2, n):
        i = m - 1
        j = n - 1
        p1 = m + n - 1
        while i >= 0 and j >= 0:

            if nums1[i] <= nums2[j]:
                nums1[p1] = nums2[j]
                j -= 1
            else:
                nums1[p1] = nums1[i]
                i -= 1
            p1 -= 1
        # print(j, p1)
        while j >= 0:
            nums1[p1] = nums2[j]
            j -= 1
            p1 -= 1

        print(nums1)


if __name__ == "__main__":
    # print(Solution().merge([1,2,3,0,0,0], 3, [2,5,6], 3))
    print(Solution().merge([4,5,6,0,0,0], 3, [1,2,3], 3))

