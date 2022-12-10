# // Time Complexity : O(n+m) also O(m+n) is better than mlogn
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

class solution:
    ## the difference between this and seaching2darray 1 is that the last element of previous row could be greater
    ## the first element of current row. So we cannot assume a continually increasing array. so our approach is the reduce the search spce.
    ## we can start from top right corner or bottom left corner. Here we started from top right. and we check if the number is less than the element at 
    ## that cell. if so we reduce the col else we increment the row. if we get the key then return True else return False
    def search(self, matrix, key):
        row  = 0
        col = len(matrix[0])-1

        while row< len(matrix) and col>=0:

            if key == matrix[row][col]:
                return True

            if key < matrix[row][col]:
                col-=1
            
            else:
                row+=1
        return False