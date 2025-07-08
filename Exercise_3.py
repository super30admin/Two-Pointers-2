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
Time: O(M* log N), Space: O(1)

3. Binary search on rows:
For every column, run a binary search across all rows
Time: O(N* log M), Space: O(1)

4. Two-pointer:
Start with top-right element. Note that:
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

We could also start from bottom-left:
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
top-left: going right or going down, both yield increasing seq
If target > top-left ele, we need to go in a direction of increasing seq. But which direction to pick - right or down? We can't say for sure. This leads to ambiguity.

Likewise, we cannot start at bottom-right since:
bottom-right: going left or going up, both yield decreasing seq

https://youtu.be/XJytDszgN14?t=2037

Complexity: Starting at top-right, at most, we move M steps downwards and N steps to the left before we declare find/not find the target. Hence, max steps = M + N

Time: O(M+N), Space: O(1)
'''

def search_2d_matrix2(mat, target):
    M = len(mat)
    if M == 0:
        return False
    N = len(mat[0])

    # Initialize two pointers to start from top, right
    row, col = 0, N-1

    while 0<=row<M and 0<=col<N:
        if mat[row][col] == target:
            return True
        if mat[row][col] > target:
            col -= 1
        else:
            row += 1
    return False

def run_search_2d_matrix2():
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
        found = search_2d_matrix2(mat, target)
        print(f"\nMatrix = {mat}")
        print(f"Target = {target}")
        print(f"Found = {found}")
        print(f"Pass: {ans == found}")

run_search_2d_matrix2()
