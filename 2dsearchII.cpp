
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

/*
we will use the fact that the rows and columns are sorted in ascending order.
The approach is that we will be taking any of the top right corner or bottom left corner
of the matrix and keep checking if the matrix element is greater or smaller than the target value

In each iteration we will be eliminating either 1 row or 1 column based on the
comparision between the target and the element and eventually we will reach the required element,
if found, return true,

else, return false.
*/

// Your code here along with comments explaining your approach


#include <iostream>
#include <vector>

using namespace std;
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n=matrix.size();
        int m = matrix[0].size();
        int r=n-1;
        int c=0;

        while(r>=0 && c<m){

            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                r--;


            }
            else{
                c++;

            }

        }

        return false;
        
        
    }
};