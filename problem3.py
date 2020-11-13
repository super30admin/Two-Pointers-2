#timecomplexity O(n)
#spacecomplexity O(1)
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        """
        # from the right top corner and bottom left you start your search becouse 
        from only that part previous element in small and down element is bigger/ viceversa for bottom left corner
        #i and j are pointing to the last element of the first row
        """
        if matrix==[]: return False
        i=0
        j=len(matrix[0])-1
        while (i<len(matrix) and j>=0):

            if target==matrix[i][j]:
                return True
            elif target>matrix[i][j]:# if target is greater then i++ means it might be in next row
                i+=1
            else:
                j-=1 # it might be before this cell but not in this column
        return False
                
        