
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//80. Remove Duplicates from Sorted Array II

class Solution(object):
    def removeDuplicates(self, nums): // T.C -> O(N) , S.C->O(1)
        """
        :type nums: List[int]
        :rtype: int
        """
        
        k = 2
        f = 1
        s = 1
        count = 1

        while f <= len(nums)-1:

            if nums[f] == nums[f-1]:
                count+=1
            else:
                count=1
            
            if count <= k:
                nums[s] = nums[f]
                s+=1
            f+=1
        return s

//88. Merge Sorted Array
class Solution(object): 
    def merge(self, nums1, m, nums2, n): //T.C->O(N) , S.C->O(1)
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        idx = len(nums1) - 1
        i = m - 1
        j = n - 1

        while i>=0 and j>=0:
            if nums1[i] > nums2[j]:
                nums1[idx] = nums1[i]
                i-=1
            else:
                nums1[idx] = nums2[j]
                j-=1
            idx-=1
        while j>=0:
            nums1[idx] = nums2[j]
            j-=1
            idx-=1
        return nums1
//240. Search a 2D Matrix II
class Solution(object):
    def searchMatrix(self, matrix, target): // T.C -> O(M+N) , S.C -> O(1)
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """

        m = len(matrix)
        n = len(matrix[0])
        r = m - 1
        c = 0

        while r >= 0 and c < n:

            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                c+=1
            else:
                r-=1
        return False
