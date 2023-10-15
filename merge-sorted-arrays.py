# Intutition:

# Brute force - start with first element of each array and keep comparing. whiever is greater add to output array until you reach end of one of the array. Whichever hasn't reached end, just append  remaining elements to the output array.
# TC: O(m+n)
# SC: O(m+n)

# 2 ptrs - start with last element of both array and keep checking whchever is greater. Append the greater element to the last of nums1 array since question asks about in-place and nums1 has m+n length.
# TC: O(m+n)
# SC: O(1)

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        k = m+n-1  # pointing to the end of nums1

        # until one of i or j go out of bound, keep checking which value out of the two arrays (starting from m-1 and n-1) is greater. Whichever is greater, append it to the end of nums1. Keep moving k ptr to left with each append.
        while j >= 0 and i >= 0:
            print("i: {}, j : {}".format(i, j))
            if nums2[j] > nums1[i]:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1

            else:
                nums1[k] = nums1[i]
                i -= 1
                k -= 1

        # if nums2 goes out of bound, that means its okay since we are rteurning final in nums1
        # but if nums1 goes out of bound, that is i <0; then at whatever pointer j was starting from there until j reaches 0, insert all element as-is to nums1
        if i < 0:
            for j in range(j, -1, -1):
                nums1[k] = nums2[j]
                k -= 1


obj = Solution()
nums1 = [1, 2, 3, 0, 0, 0]
nums2 = [2, 5, 6]
m = 3
n = 3
res = obj.merge(nums1, m, nums2, n)
print(res)
