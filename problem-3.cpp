// 240. Search a 2D Matrix II
// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    starts the search from the top-right corner of the matrix, utilizing the 
    fact that elements to the left of a position are smaller and elements below 
    are larger. moves either left or down depending on the comparison 
    of the current element with the target until the target is found or the search goes 
    beyond the matrix boundaries, in which case it returns false.

*/
bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size(), n = matrix[0].size();
        int i = 0, j = n-1;
        while(i < m && j >= 0)
        {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
