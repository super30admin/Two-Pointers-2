/*
Time complexity:
It is O(m+n)
*/
/*Space complexity 
 O(1)
 */

/*
Approach:
We are making use of the sorted rows and columns. As we know that columns have values
increasing in the downward direction and the rows have values increasing in the
rightward direction. If we start at the righmost column and top row, we can compare our
target with the value there. If the target is less than the value at that index, we can 
decrement the column by 1, otherwise increment the row by 1. In this manner, we are reducing
the search space in an optimized manner. We can start from the bottom left corner too, 
because the values are reducing in bottom to top and increasing from left to right*/


//The code ran perfectly on leetcode.


class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size() == 0) return false;
        int n = matrix[0].size();
        int i = 0, j = n-1;
         while(i < matrix.size() && j >= 0){
                if(matrix[i][j] == target)
                {
                    return true;
                } 
                
                else if(matrix[i][j] < target) {
                    i++;
                } else {
                    j--;
                }
             
            }
        return false;
    }
};
