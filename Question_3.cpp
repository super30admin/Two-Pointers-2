#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;
bool searchMatrix(vector<vector<int>>& matrix, int target) {
    int m = matrix.size(), n = matrix[0].size();
    int ptr_r = 0, ptr_c = n-1;
    while(ptr_r<=m-1&&ptr_c>=0){
        if(matrix[ptr_r][ptr_c]==target) return true;
        else if(matrix[ptr_r][ptr_c]<target) ptr_r++;
        else ptr_c--;
    }
    return false;
}

int main(){
    vector<vector<int>> matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target = 3;
    cout<<searchMatrix(matrix,target);
    return 0;
}
// Time Complexity: O(m+n)
// Space Complexity: O(1)
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
// Explanation: The target 3 is present in the matrix.