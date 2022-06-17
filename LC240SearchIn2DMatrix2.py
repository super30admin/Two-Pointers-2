"""
Search in a 2D sorted matrix
Elements in a row are sorted from Left to right
and in a column are sorted from top to bottom

what we saw before in Week1(binary search lessons) is that the first element in second row is greater than the last element in first row

Brute force for this problem - 
run two loops and search element by element TC = O(n*n)
            |
            v
[[1,4,7,11,15],
 [2,5,8,12,19],
 [3,6,9,16,22],
 [10,13,14,17,24],
 [18,21,23,26,30]]
  ^
  |

Pointer solution :
 We can start from top right, or bottom left as from both the points either of the neighbors(left/bottom) or (right/top)
 will be lower than the other one, getting us closer to the target.

 In case of other ends, both the neighbors will either be smaller or larger than the current element and there are chances that we 
 get lost and never find the element

 TC = O(m+n)


"""
class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n-1
        if matrix == None:
            return False
        while(i<m and j >=0):
        
            if matrix[i][j] == target:
                return True
            if matrix[i][j]< target:
                i+=1
            else:
                j-=1
        return False
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
object = Solution()
ans = object.searchMatrix(matrix, target)
print(ans)




        

