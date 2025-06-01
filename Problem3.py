# https://leetcode.com/problems/search-a-2d-matrix-ii/

# // Time Complexity :O(M+N)
# // Space Complexity :o(1)
# // Did this code successfully run on Leetcode :YES
# // Three line explanation of solution in plain english
# This problem has multiple solutions , one with binary search other is just moving towards target ,start with top right corner(you can also start from  left bottom corner) 

# // Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, mat: List[List[int]], target: int) -> bool:
        #[m][n]
        m,n=0,len(mat[0])-1
        max_m,max_n=len(mat),len(mat[0])
        while(n>=0 and m<max_m):
            if mat[m][n]==target:return True
            elif target<mat[m][n]:n-=1
            elif target>mat[m][n]:m+=1
        return False

        
