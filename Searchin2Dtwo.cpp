#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Start at the top right or bottom left corner of the matrix
if target is found return true else if target is greater than the element increment the row
else decrement the column
*/
class Solution{
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m=matrix.size();
        int n=matrix[0].size();
        int r=0, c=n-1;
        while(r<m && c>=0){
            if(target==matrix[r][c]) return true;
            if(target>matrix[r][c]) r++;
            else c--;
        }
        return false;
    }
};
