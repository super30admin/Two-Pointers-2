class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Approach 1: Binary Search
        # Time : O(m * logn) m is rows and n is cols
        # SPace : O(1)
        # def binary_search(arr, target):
        #     low = 0
        #     high = len(arr) - 1
        #     while low <= high:
        #         mid = low + (high - low) // 2
        #         if arr[mid] < target:
        #             low = mid + 1
        #         elif arr[mid] > target:
        #             high = mid - 1
        #         else:
        #             return True
        #     return False
        # rowlen = len(matrix)
        # collen = len(matrix[0])
        # if rowlen == 1 and collen == 1:
        #     if target == matrix[0][0]:
        #         return True
        #     return False
        # for i in range(rowlen):
        #     if target in range(matrix[i][0], matrix[i][collen-1]+1):
        #         if binary_search(matrix[i], target):
        #             return True
        # return False

        # Optimised approach
        # Time: O(m + n) m is rows and n is cols
        # Space : O(1)
        rowlen = len(matrix)
        collen = len(matrix[0])
        posr = 0
        posc = collen - 1
        while posr < rowlen and posc >= 0:
            if matrix[posr][posc] < target:
                posr += 1
            elif matrix[posr][posc] > target:
                posc -= 1
            else:
                return True
        return False



