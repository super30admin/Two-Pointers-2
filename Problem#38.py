'''
240. Search a 2D Matrix II
LeetCode Problem Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
Problem Name: Search 2D sorted matrix II

Source Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
'''

# Time Complexity : O(m + n) where m is the number of rows and n is the number of columns
# Space Complexity : O(1) since we are using constant space for pointers
# Did this code successfully run on Leetcode : Yes, it passed all test cases.
# Any problem you faced while coding this : Yes, understanding the two-pointer technique in a 2D matrix was a bit tricky at first, but it became clearer with practice.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Approach 1: Using Binary Search
        # if not matrix or not matrix[0]: # Agar matrix khali hai ya pehli row khali hai (If the matrix is empty or the first row is empty)
        #     return False # toh False return karo (return False)
        # rows, cols = len(matrix), len(matrix[0]) # rows aur cols ka length nikaalo (Get the number of rows and columns)
        # left, right = 0, rows * cols - 1 # left pointer ko 0 pe aur right pointer ko last index pe set karo (Set left pointer to 0 and right pointer to the last index)
        # while left <= right: # jab tak left pointer right pointer se chhota ya barabar hai (while left pointer is less than or equal to right pointer)
        #     mid  = left + (right - left) // 2 # mid index nikaalo (Calculate the mid index)
        #     mid_value = matrix[mid // cols][mid % cols] # mid_value ko matrix se nikaalo (Get the value at mid index from the matrix)
        #     if mid_value == target: # agar mid_value target ke barabar hai (if mid_value is equal to target)
        #         return True # toh True return karo (return True)
        #     elif mid_value < target: # agar mid_value target se chhota hai (if mid_value is less than target)
        #         left = mid + 1 # toh left pointer ko mid + 1 pe set karo (set left pointer to mid + 1)
        #     else: # agar mid_value target se bada hai (if mid_value is greater than target)
        #         right = mid - 1 # toh right pointer ko mid - 1 pe set karo (set right pointer to mid - 1)
        # return False # agar target nahi mila (return False if target is not found)

        # Approach 2: Start from the bottom-left corner, if the current number is less than the target, move up, if it's greater, move right
        # if not matrix or not matrix[0]: # agar matrix khali hai ya pehli row khali hai (If the matrix is empty or the first row is empty)
        #     return False # toh False return karo (return False)
        # rows, cols = len(matrix), len(matrix[0]) # rows aur cols ka length nikaalo (Get the number of rows and columns)
        # row, col = rows - 1, 0 # neeche se shuru karo (Start from the bottom-left corner)
        # while row >= 0 and col < cols: # jab tak row 0 se bada ya barabar hai aur col cols se chhota hai (while row is greater than or equal to 0 and col is less than cols)
        #     if matrix[row][col] == target: # agar current number target ke barabar hai (if the current number is equal to target)
        #         return True # toh True return karo (return True)
        #     elif matrix[row][col] < target: # agar current number target se chhota hai (if the current number is less than target)
        #         col += 1 # toh right move karo (move right)
        #     else: # agar current number target se bada hai (if the current number is greater than target)
        #         row -= 1 # toh upar move karo (move up)
        # return False # agar target nahi mila (return False if target is not found)

        # Approach 3: Two-pointer technique
        if not matrix or not matrix[0]: # Agar matrix khali hai ya pehli row khali hai (If the matrix is empty or the first row is empty)
            return False # toh False return karo (return False)
        rows, cols = len(matrix), len(matrix[0]) # rows aur cols ka length nikaalo (Get the number of rows and columns)
        left, right = 0, cols - 1 # left pointer ko 0 pe aur right pointer ko last column pe set karo (Set left pointer to 0 and right pointer to the last column)
        while left < rows and right >= 0: # jab tak left pointer rows se chhota hai aur right pointer 0 se bada ya barabar hai (while left pointer is less than rows and right pointer is greater than or equal to 0)
            if matrix[left][right] == target: # agar current number target ke barabar hai (if the current number is equal to target)
                return True # toh True return karo (return True)
            elif matrix[left][right] < target: # agar current number target se chhota hai (if the current number is less than target)
                left += 1 # toh neeche move karo (move down)
            else: # agar current number target se bada hai (if the current number is greater than target)
                right -= 1 # toh left move karo (move left)
        return False # agar target nahi mila (return False if target is not found)
        # Note: The above approach is similar to the second approach but uses a different starting point