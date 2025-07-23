# // Time Complexity : O(n)
# // Space Complexity : O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = len(matrix)-1 
        j = len(matrix[0])-1

        p,q = 0,j
        print(p,q,i,j)
        while(p<=i and q>=0):
            if(matrix[p][q] == target):
                return True
            elif(matrix[p][q] > target):
                q-=1
            else:
                p+=1
        return False   