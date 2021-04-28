## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
# Approach 1 - Optimal
# Time complexity - O(m+n), m=number of rows, n=number of columns
# Space complexity - O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        
        i=len(matrix)-1
        j=0
        
        while(i>=0 and j<len(matrix[0])):
            if(matrix[i][j] == target):
                return True
            elif(target > matrix[i][j]):
                j+=1
            else:
                i-=1
        return False
        
        
# Apporach 2 - Binary Search
# Time complexity - O(mlogn)
# Space complexity - O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        
        def helperBinaryFunction(nums,low,high):
            while(low<=high):
                mid = low+(high-low)//2
                if(nums[mid] == target):
                    return True
                elif(target<nums[mid]):
                    high=mid-1
                else:
                    low=mid+1
            return False
        
        i=0
        j=len(matrix[0])-1
        
        while(j>=0 and matrix[0][j]>target):
            j-=1
        
        while(i<len(matrix)):
            if matrix[i][0] <= target and matrix[i][j] >= target:
                response = helperBinaryFunction(matrix[i],0,j)
                if response:
                    return True
            i=i+1
        return False
                    
                    
        