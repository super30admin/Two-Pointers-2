
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* Start from bottom right corner. If the value is less than the target then increment the row
because all the elements in that row would be less than that number
if the value is greater than the target then eliminate that column as all the values will be greater than target
move onto the col-1 . repeat until found */
// Your code here along with comments explaining your approach



#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix.at(0).size();
        int i{},j{n-1};
        while(i<m && j>=0){
            if (matrix.at(i).at(j) == target) return true;
            else if (matrix.at(i).at(j)<target)i++;
            else if(matrix.at(i).at(j)>target) j--;
        }
        return false;
    }
};