############# Search a 2d matrix -II ############

# Time Complexity : O(n+m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Using the top right corner if the value is less than the current go left and if it is more go down and if out of bounds not found

def search_in_matrix(matrix,target):
    if not matrix:
        return False
    
    x  = 0
    y = len(matrix[0])-1
    
    while x < len(matrix) and y >=0:
        if matrix[x][y] > target:
            y-=1
        elif matrix[x][y] < target:
            x+=1
        else:
            return True
        
    return False
    

