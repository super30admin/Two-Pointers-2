'''
240 Search a 2D Matrix II

https://leetcode.com/problems/search-a-2d-matrix-ii/description/

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Example 1:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

Example 2:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false

Constraints:
m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matrix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109

Solution:
1. Brute Force:
Traverse every element in the matrix and compare the element with the target
Time: O(M*N), Space: O(1)

2. Binary search on columns:
For every row, run a binary search across all columns. Alternatively, we could first check if the target lies between the first and last ele of each row. If yes, only then do a binary search. However, it's possible that this condition is satisifed for every row. Eg. [[1, 4, 20], [1, 10, 30], [2, 6, 10]] and target = 6. In this case, the alternative method doesn't really improve time complexity.
Time: O(M log N), Space: O(1)

3. Binary search on rows:
For every column, run a binary search across all rows
Time: O(N log M), Space: O(1)

4. Two-pointer:
Key Idea: Start from an element where you get one increasing and one decreasing sequence when you traverse horizontally or vertically.

traverse dir       seq type
horizontal         Increasing
vertical           Decreasing
          OR

horizontal         Decreasing
vertical           Increasing


Method 1: Start with top-right element.
a) traversing the col from top to bottom yields an increasing order sequence
b) traversing the row from right to left yields a decreasing order sequence
We can use this observation to find the target.
Step 0: row = 0, col = M-1
Step 1: while row and col are within bounds
if matrix[row][col] == target:
   return True
elif matrix[row][col] > target:
   # need to find smaller elements -> go left
   col--
else:
    # need to find larger elements -> go down
   row++
Step 2: If we come out of the loop, then we have not found the target, hence return False.

Method 2: We could also start from bottom-left:
a) traversing the col from bottom to top yields a decreasing sequence
b) traversing the row from left to right yields an increasing sequence
Then, the logic is
if matrix[row][col] == target:
   return True
elif matrix[row][col] > target:
   # need to find smaller elements -> go up
   row--
else:
    # need to find larger elements -> go right
   col++

Note that we could not start from top-left since if we start at:
top-left: going right on row or going down on col, both directions yield increasing sequences
For eg, if target > top-left ele, we need to go in a direction of increasing seq. But which direction to pick - right or down? We can't say for sure. This leads to ambiguity.

Likewise, we cannot start at bottom-right since:
bottom-right: going left on col or going up on row, both directions yield decreasing sequences

https://youtu.be/XJytDszgN14?t=2037

Complexity: Starting at top-right, at most, we move M steps downwards and N steps to the left before we declare find/not find the target. Hence, max steps = M + N

Time: O(M+N), Space: O(1)
'''
def search_2d_matrix1(mat, target):
    '''
    Two pointer: Start from top right
    '''
    M = len(mat)
    if M == 0:
        return False
    N = len(mat[0])

    r, c = 0, N-1
    while r < M and c >= 0:
        if mat[r][c] == target:
            return True
        if mat[r][c] < target:
            r += 1
        else:
            c -= 1
    return False

def search_2d_matrix2(mat, target):
    '''
    Two pointer: Start from bottom left
    '''
    M = len(mat)
    if M == 0:
        return False
    N = len(mat[0])

    r, c = M-1, 0
    while r >= 0 and c < N:
        if mat[r][c] == target:
            return True
        if mat[r][c] < target:
            c += 1
        else:
            r -= 1
    return False


def run_tests():
    tests = [([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 5, True),
             ([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 20, False),
             ([[0],[2],[4],[6],[8]], 6, True),
             ([[0],[2],[4],[6],[8]], 5, False),
             ([[0, 2, 4, 6, 8]], 6, True),
             ([[0, 2, 4, 6, 8]], 5, False),
             ([[1]], 1, True),
             ([[1]], 0, False),
             ]
    for test in tests:
        mat, target, ans = test[0], test[1], test[2]
        found1 = search_2d_matrix1(mat, target)
        found2 = search_2d_matrix2(mat, target)
        print(f"\nMatrix = {mat}")
        print(f"Target = {target}")
        passed = (ans == found1 == found2)
        assert passed == True, f"Test case failed"
        print(f"Pass: {passed}")

    print(f"\nDONE")

run_tests()
