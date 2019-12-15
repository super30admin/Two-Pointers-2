class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.empty() || matrix.size() == 0) return false;

        int row = matrix.size() - 1;
        int column = 0;

        while(row >= 0 && column < matrix[0].size()){
            //(matrix[row][column] == target) return true;
             if(matrix[row][column] > target){     //if target is less, move up
                row--;
            }else if(matrix[row][column] < target){   //if target is greater, move right
                column++;
            }else{
                 return true;
             }
        }
        return false;
    }
};

//Time Complexity: O(m+n)
//Space Complexity: O(1)
