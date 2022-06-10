#Time Complexity: O(m+n)
#Space Complexity: O(1)
def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows=0
        cols=len(matrix[0])-1
        while cols>=0 and rows>=0 and rows<len(matrix) and cols<len(matrix[0]):
            if matrix[rows][cols]==target:
                return True
            elif matrix[rows][cols]>target:
                cols-=1
            else:
                rows+=1
  
                