//TC-O(M+N)
//SC-O(1)
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row_num=matrix.size();
        if(row_num==0)return false;
        int colum_num=matrix[0].size();
        
        int start=0;
        int end=colum_num-1;
        while(start<row_num && end>=0){
        
            if(target==matrix[start][end]){
                return true;
            }
            else if(target<matrix[start][end]){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
};