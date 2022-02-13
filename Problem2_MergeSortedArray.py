#Time Complexity: O(n+m)
#Space Complexity: O(1)
#Leetcode: Yes

'''
Approach: Start from end, if nums1 is exhausted copy all from nums2.
'''

class Solution:
    def merge(self, nums1,m, nums2, n):
        i,j = m-1, n-1
        k = len(nums1)-1
        while(i>=0 and j>=0):
            if nums1[i]<nums2[j]:
                nums1[k] = nums2[j]
                j-=1
                k-=1
            else:
                nums1[k] = nums1[i]
                i-=1
                k-=1
        while(j>=0):
            nums1[k] = nums2[j]
            k -= 1
            j -= 1
        return nums1


obj = Solution()
nums1,nums2 = [1,2,3,0,0,0],[2,5,6]
print(obj.merge(nums1, 3, nums2, 3))