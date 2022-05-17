# Time Complexity : O(M+N) when M and N are the number of elements in list 1 and list 2 respectively
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1, p2, i = m-1, n-1, m+n - 1
        
        while p1 >= 0 and p2 >= 0:
            if nums2[p2] >= nums1[p1]:
                nums1[i] = nums2[p2]
                p2 -= 1
            else:
                nums1[i] = nums1[p1]
                p1 -= 1
            i -= 1
        
        while p2 > -1:
            nums1[i] = nums2[p2]
            p2 -= 1
            i -= 1

        return nums1

solution = Solution()
print(f'OUTPUT >> {solution.merge([1,2,3,0,0,0], 3, [2,5,6], 3)}')