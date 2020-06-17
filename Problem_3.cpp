// Time Complexity : O(n).
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : YES


class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
      if(matrix.size()==0) return false;
      int r = 0;
      int c = matrix.at(0).size()-1;
      while(r<matrix.size() && c>=0){
          if(matrix[r][c]==target){
              return true;
          }
          else if(matrix[r][c]<target){
              r++;
          }
          else{
              c--;
          }
      }
      return false;  
    }
};