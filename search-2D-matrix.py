#Time Complexity : O(m+n)
#Space Complexity: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        def searchInCol(matrix, i, q, target):
            
            p = 0
        

            while p <=q:
                mid = (q+p)//2

                if matrix[i][mid] == target:
                    return True
                elif matrix[i][mid] < target:
                    p = mid+1
                else:
                    q = mid-1
            return False

            
        m = len(matrix)
        n = len(matrix[0])
        #find the column
        i = 0
        j = m-1
        while i <= j:
            if target == matrix[i][n-1]:
                return True
            if target < matrix[i][n-1]:
                if searchInCol(matrix, i, n-1, target) == False:
                    i +=1
                else:
                    return True
            else:
                i+=1
        
    