
// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

// Three line explanation of solution in plain english
// iterate over the array using two pointers(one at top right and the other at top left)
// if target is less than the element at current position,decrement the column pointer else incremnet the row pointer


class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.empty()) {return false;}
        
        int row = matrix.size();
        int col= matrix[0].size();
        
        int low =0; 
        int high = row*col-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int e = matrix[mid/col][mid%col];
            if(e== target){
                return true;
            }if(e> target){
                high=mid-1;
            }else{
                low =mid+1;
            }
        }
        return false;
    }
};