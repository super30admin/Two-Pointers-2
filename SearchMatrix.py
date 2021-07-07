class SearchMatrix(object):
    '''
    Solution:
    1.  Maintain one pointer starting from either top right or bottom left and search the matrix by modifying row or
        column indices of the pointer to move in a direction towards the target.
    2. Splitting into 3 cases, if the target is found, return true.
    3. Otherwise move top or left if target is lower and move bottom or right if target is higher and return false
        if not found.

    --- Passed all testcases successfully on leetcode.
    O(max(m, n)) Time Complexity | O(1) Space Complexity
    '''

    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """

        if (matrix == None or len(matrix) == 0):
            return False

        rows = len(matrix);
        cols = len(matrix[0])
        currRow = rows - 1;
        currCol = 0

        while (currRow >= 0 and currCol < cols):
            if (matrix[currRow][currCol] == target):        # case 1 == return true
                return True
            elif (matrix[currRow][currCol] < target):       # case 2 == move right
                currCol += 1
            else:                                           # case 3 == move top
                currRow -= 1

        return False