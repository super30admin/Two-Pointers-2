240. Search a 2D Matrix II

// Time Complexity :O(M+N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english

// placing pointer at a place where we can move pointer based on certain condition.Here,
// I will place at lower left corner,as the rows and columns are sorted ,I will compare target with the current 
// value if it is less I will top side else I will move right side

// Your code here along with comments explaining your approach



class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int j=0;
        int i= matrix.size()-1;
// here pointer can be started from i=matrix[0].size()-1 and j=0 as well ,pointer 
// can be placed such that on conditions we can move pointer in a decisive manner.
        while(i>=0 && j<matrix[0].size())
        {
            if(matrix[i][j]==target)
            return true;
            else if(target<matrix[i][j])
            {
                i--; // moving up
            }
            else
            {
                j++; // moving right
            }
        }
        return false;
    }
};