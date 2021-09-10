// Time Complexity : 0(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*Set the ptr to either top right of matrix or bottom left of matrix(as they have opposite order(>,<) elements needed for solution) here top right is selelcted
if element is greater go left or if smaller go down, if element not found return false*/
// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size() == 0) return false;  // null case
        int m = matrix.size(); 
        int n = matrix[0].size();
        int i = 0; int j = n-1;   // setting ptr to top right of matrix
        while(i<m && j >= 0)
        {
            if(matrix[i][j] == target) return true;   // if found return true
            else if(matrix[i][j] > target){  // if greater, go left
                j--;
            }
            else if(matrix[i][j] < target){  // if smaller, go right
                i++;
            }
            
        }
        return false;  // return false if not found
    }
};

// int main(){
    
//     return 0;
// }