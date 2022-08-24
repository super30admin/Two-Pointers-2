"""
S30 FAANMG Problem #38 {Medium}

240. Search a 2D Matrix II

Time Complexity : O(M+N)

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  
We would be starting either diagonal corners

if the Traget is greater than the Value in mat[i][j] then we will go to next row mat[i+1][j]
 else we will go to left i.e mat[i][j-1]


@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        
        if(len(matrix) == 0):
            return False
        m = len(matrix)
        n = len(matrix[0])
        
        i = 0
        j = n-1
        
        while(i < m and j >=0):
            
            if(matrix[i][j] == target):
                return True
            
            if(matrix[i][j] > target):
                j -=1
            else:
                i +=1
                
        return False
    
"""
S30 FAANMG Problem #38 {Medium}

240. Search a 2D Matrix II

Time Complexity : O(Mlogn)

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  

Here we have 3 pointers
p1 = m-1
p2 = n-1
idx = m+n-1

Binary Search on each row if the target in the range


@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:

        
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        
        if(len(matrix) == 0):
            return False
        
        m= len(matrix)
        n=len(matrix[0])
        
        for i in range(m):
            if(matrix[i][0] <= target <= matrix[i][n-1]):
                
                low = 0
                high = n-1
                
                while(low <= high):
                    
                    mid = low +(high-low)//2
                    
                    if(matrix[i][mid] == target):
                        return True
                    if (target < matrix[i][mid] ):
                        high = mid -1
                    else:
                        low = mid+1
                        
                
        return False