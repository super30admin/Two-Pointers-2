//Time Complexity : O(m+n)

#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size(),n = matrix[0].size(),r=0,c=n-1;
        while(r<m && c>=0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] < target)
                r++;
            else
                c--;
        }
        return false;
    }
};