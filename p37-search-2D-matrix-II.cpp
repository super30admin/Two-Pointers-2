// Time complexity is O(m+n)
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
  1. Start the search from rightmost top element or leftmost bottom element.
  2. When we start the search from top right corner, we iterate to left by
     reducing column(j) if value at (i,j) is greater than the target.
     If it is less than the target we iterate to bottom by increasing row(i).
  3. When we start the search from bottom left corner, we iterate to right by
     increasing column(j) if value at (i,j) is less than the target.
     If it is greater than the target we iterate to top by decreasing row(i).
  4. We return true when we find target at (i,j). When the loop terminates,
     we return false indidcating that the target is not present in the matrix.
*/

//Starting the search from leftmost bottom element in the matrix
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(!matrix.size()) return 0;
        int m = matrix.size()-1;
        int n = matrix[0].size()-1;
        // Starting the search from leftmost bottom element in the matrix
        int i = m; // i represents row
        int j = 0; // j repreesnts column
        
        while(i >= 0 && j <= n) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                i--;
            else
                j++;
        }
        return false;
    }
};

// Time complexity is O(m+n)
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Starting the search from rightmost top element in the matrix
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(!matrix.size()) return 0;
        int m = matrix.size()-1;
        int n = matrix[0].size()-1;
        // Starting the search from rightmost top element in the matrix
        int i = 0; 
        int j = n;
        
        while(i <= m && j >= 0) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
};
