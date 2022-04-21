class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        '''
        T = O(N+M)
        S = O(1)
        '''
        height = len( matrix)
        width = len(matrix[0])
        row = height - 1
        col = 0 
        while row >= 0 and col < width :
            if matrix[row][col] > target:
                row -= 1 
            elif matrix[row][col] < target:
                col += 1 
            else:
                return True
        return False
    
    def subOptimalsearchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        '''
        Algo : iterate over the rows of the matrix, 
        at each row, do a Binary search 
        T = O(MlogN) ,  M - no of rows, N - no of cols 
        S = O(1)
        '''
        for i in range(len(matrix)):
            # print(matrix[i])
            if self.binary_search( matrix[i] , target, 0 , len(matrix[i])-1  ):
                return True
        return False
    
    def binary_search( self, arr , target , low, high ):
        if low <= high:
            mid = low + ( high - low ) // 2
            # print(  low , high , mid)
            if arr[mid] == target :
                return True
            elif target > arr[mid]:
                return self.binary_search( arr , target , mid+1 , high )
            else:
                return self.binary_search( arr , target , low, mid-1 ) 
        else:
            return False
    
    
            
