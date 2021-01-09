class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Time Complexity: O(m+n)
        # Space Complexity: O(1)
        if(len(matrix)==0 or len(matrix[0])==0):
            return False
        # always 1 element in queue for this case
        queue = deque([[0,len(matrix[0])-1]])
        while(len(queue)>0):
            i,j = queue.pop()
            if(matrix[i][j]==target):
                return True
            i_down, j_left = i+1, j-1
            if(i_down<len(matrix) and target>=matrix[i_down][j]):
                queue.appendleft([i_down,j])
            elif(j_left>=0 and target<=matrix[i][j_left]):
                queue.appendleft([i,j_left])
            elif(i_down<len(matrix) and j_left>=0):
                queue.appendleft([i_down,j_left])
        return False
