//TC: O(m+n)
//SC: O(1)
//Approach: Start from the top-right corner of the matrix. Move left if the current element is greater than the target, and move down if it is smaller, continuing until the target is found or the boundaries are exceeded.
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size(); //row
        int n = matrix[0].size(); //column
        int r=0; 
        int c= n-1;
        while(r<m && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else{
                 r++; 
            }
        }
        return false;
    }
};