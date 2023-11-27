/*Start from the top-right corner (r=0, c=n-1) of the matrix.
If the current element is equal to the target, return true.
If the current element is greater than the target, move left (c--); if it's smaller, move down (r++).
Repeat steps 2-3 until the element is found or the boundaries are crossed.
Time Complexity: O(m + n) - Linear time complexity as it explores at most m rows and n columns.
Space Complexity: O(1) - Constant extra space is used, as the algorithm modifies the pointers in-place.*/
#include<bits/stdc++.h>
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m=matrix.size();
        int n=matrix[0].size();
        int r=0,c=n-1;
        while(r<m&&c>=0){
            if(matrix[r][c]==target)return true;
            else if(matrix[r][c]>target)c--;
            else r++;
        }
        return false;
    }
};