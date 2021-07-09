class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix)==0 and len(matrix[0])==0:
            return False
        n=len(matrix)
        m=len(matrix[0])
        col=0
        row=len(matrix)-1
        while(row>=0 and col<m):
            if matrix[row][col]==target:
                return True
            elif matrix[row][col]>target:
                row-=1
            else:
                col+=1
        return False     
        #Time O(n+m)
        #Space O(1)
        
        
        
#         n=len(matrix)
#         m=len(matrix[0])-1
#         def binsearch(array):
#             left=0
#             right=len(array)-1
#             while(left<=right):
#                 mid=(left+right)//2
#                 if array[mid]==target:
#                     return True
#                 elif array[mid]>target:
#                     right=mid-1
#                 else:
#                     left=mid+1
#         for i in range(n):
           
#             if target==matrix[i][0] or target==matrix[i][m]:
#                 return True
#             elif target>matrix[i][0] and target<matrix[i][m]:
#                 if binsearch(matrix[i]):
#                     return True
#         return False
#     #Time O(mlogn)
#     #Space O(1)
                    
