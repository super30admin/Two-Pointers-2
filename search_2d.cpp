//TC: O(n+m) since row can only be decremented n times and column can only be decremented n times.
//SC: O(1)

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
       //check rows and find the first row where first element is lesser than target.
        //check in this row and when we reach column that is greater than target, go up.
        
        int row = matrix.size()-1;
        int col= 0;
        while(row>=0 && col<matrix[0].size()){
            //if row element is greater than target, then reduce until row element is lesser
            if(matrix[row][col] > target)
                row--;
            //increment column until element is less than target
            else if(matrix[row][col]<target)
                col++;
            else return true;
        }
        
        return false;
        
    }
};