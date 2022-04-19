#search matrix 2

# // Time Complexity : O(n+m)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no



def searchMatrix( matrix, target) :
    r=len(matrix)-1
    c=0
    while( r>=0 and c<len(matrix[0]) ):             #starting at the lower left corner; 
        ans = matrix[r][c]
        if(ans==target):
            return True
        elif (ans < target):                        #if the number is less than target, then we know the number should be on the right of the current number
            c+=1
        else:                                       #if the number is good, it should be above the current row
            r-=1
    return False


#testing
print(searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 5))