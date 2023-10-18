class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Time complexity: O(n log n) - I do a binary
        Space complexity: O(1) - only few variables used
        Solution: Use binary search and interate through all the rows.
        Did this code successfully run on Leetcode: Yes
        Any problem you faced while coding this: No
        """
        
        # Go through all the rows in the matrix
        for row in matrix:
            result = self.binary_search(row, target)
            print(f"result={result} row={row} target={target}")
            #Only exit if target was found
            if result: 
                return True
        # Nothing was found
        return False

    def binary_search(self, row: List[int], target: int) -> bool:

        low, high = 0, len(row)-1
        while low <= high:
            mid = low + (high-low)//2
            print(f"low={low} high={high} mid={mid}")
            # return here
            if row[mid] == target:
                print(f"target [{target}] found")
                return True
                #return mid
            # reset high if the target is to the left of the mid
            elif (target >= row[low] and target < row[mid]):
                high = mid - 1
            # reset low if the target is to the right of the mid 
            else:
                low = mid + 1
                
        return False
        
