//240. Search a 2D Matrix II

/*
Start from top right corner
And do binary search to get to the element
Time Complexity: O(m+n)
Space Complexity: O(1)
*/

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {

        //bottom left
        /*
        if(matrix.size() == 0) return false;
        int m = matrix.size(), n= matrix[0].size();

        int i=m-1, j=0;
        while(i>=0 && j<n){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) j++;
            else i--;
        }

        return false;
        */

        //top right - faster and less memory

        if(matrix.size() == 0) return false;
        int m = matrix.size(), n= matrix[0].size();

        int i=0, j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }

        return false;

        /*
        //brute
        //do binary search on rows 
        int m = matrix.size();
        int n = matrix[0].size();

        for(int i=0; i<m;i++){
            int low = 0, high = n-1;

            while(low<=high){

                int mid = low+(high-low)/2;
                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid]<target) low = mid+1;
                else high = mid-1;

            }
        }

        return false;

        */
        
        
        
    }
};