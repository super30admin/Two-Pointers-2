
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//1.Edge case
//A. return if size 0
//2. Logic
//Start from the last element of the first row
//decrement row when the target is greater than the element
//decrement col when target is lesser than the element

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        if(matrix.size()==0){
            return false;
        }
        
        int rows = matrix.size();
        int cols = matrix[0].size();
        
        
        int i=0;
        int j= cols-1;
        //We strart from th end
        //Time complexity : O(m+n)
        while(i<rows && j>=0){
            
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                j--;
            }else{
              i++ ; 
            }
            
            
        }
        
        return false;
    }
};
