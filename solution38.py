#Time Complexity:O(m+n)
#Space Complexity:O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=len(matrix)                     #obtain the number of rows and columns in the matrix
        column=len(matrix[0])
        i=0                                 #initialize a pointer at the last column of first array
        j=column-1
        while(-1<i<row and -1<j<column):    #while the pointer stays within the matrix
            r=matrix[i]
            elem=r[j]
            if(elem==target):               #if the element at the pointer is same as target returb true
                return True
            if(elem<target):                #if element at pointer is less than the target move pointer to next row
                i+=1
            elif(elem>target):              #if element at pointer is greater than the target move pointer to previous column
                j-=1
        return False                        #return false of pointer moves outside the array