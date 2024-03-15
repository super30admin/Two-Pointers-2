// Time Complexity : O(n + m)             
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/search-a-2d-matrix-ii/

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
*/

/*
Explaination : 
We can start serch from right side top corner.
If target is less than accessed elelemt then move towards left or if 
target is more than accessed element then move towards down.
This algorithm works here because all rows as well columns are sorted.
*/

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int ptr1 = 0;
        int ptr2 = matrix[0].size()-1;

        while(ptr2 >= 0 && ptr1 < matrix.size()){
                    if(matrix[ptr1][ptr2] == target) return true;
                    else if (matrix[ptr1][ptr2] < target) ptr1++;
                    else ptr2--;
                }
        return false;
    }
};