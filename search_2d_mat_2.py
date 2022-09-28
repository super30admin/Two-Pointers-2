#time complexity:
#space complexity: o(m+n), at max we will only traverse entire row and col
#passed all cases on LeetCode:yes
#difficulty faced:-
# comments:in the code
#https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution:
    def searchMatrix(self, matrix: 'List[List[int]]', target: int) -> bool:
        
        rows,cols = len(matrix),len(matrix[0])
        
       
        #starting at 1st row and last col
        #if target is less move left, target gt move down from this
        #we choose this element or can choose last row and 1st col, if we did this then we move in oppo dir of above 
        #time is o(m+n) bec never crossing 
        r , c = 0,cols-1
        while (r < rows and c >=0 ):
            if target > matrix[r][c]:
                r+=1
            elif target< matrix[r][c]:
                c-=1
            else:
                return True
        return False
            