class Solution {
    // TC - O(n)
    // SC - O(1)
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size();
        int colum = matrix[0].size();
        int r = row-1;
        int c = colum-1;
        while(r>=0 && c>=0){
            if(matrix[r][c] == target) return true;
            else if( matrix[0][c] > target && matrix[r][0] > target){
                r--;
                c--;
            }
            else if(matrix[r][c]<target) return false;
            else{
                for(int i=0;i<=c;i++){
                    if(matrix[r][i] == target) return true;
                }
            
               for(int i=0;i<=r;i++){
                    if(matrix[i][c] == target) return true;
                }
                r--;
                c--;

            }
        }
        return false;
    }
};