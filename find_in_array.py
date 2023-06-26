class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(len(matrix)):
            l = 0
            h = len(matrix[i]) - 1
            result = Solution.binarysearch(l, h, matrix[i], target)
            if result:
                return True
        return False

    def binarysearch(l, h, arr, t):
        while (l <= h):
            mid = (l + h) // 2

            if (arr[mid] == t):
                return True
            elif (t > arr[mid]):
                l = mid + 1
            else:
                h = mid - 1
        return False


obj = Solution()
matrix = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22],
          [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]]
target = 5

print(obj.searchMatrix(matrix, target))