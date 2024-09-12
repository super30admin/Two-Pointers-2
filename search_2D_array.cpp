//Time comlpexity - O(m+n)
//Space complexity - O(1)
//Ran successfully on leetcode
//3 points algo is the following -
	//Keep  your pointer at the to right corner or bottom left corner
    //If(element>target) then move down the column. Else move to the left of the row

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.empty())
            return false;
        int m=matrix.size()-1;
        int n=matrix[0].size()-1;
        int i=0;
        int j=n;
        while(j>=0 && i<=m)
        {
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]>target)
                j--;
            else
                i++;                
        }
        return false;
    }
};