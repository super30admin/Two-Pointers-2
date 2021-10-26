//Time Complexity = O(r*c)
//Space Complexity = O(1)
//Where r is the number of rows and c is the number of coloumns in the matrix.
//here time limit will exceed.
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int r=matrix.size();
        int c=matrix[0].size();
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(matrix[i][j]==target)
                    return true;
        return false;
    }
};



//Time Complexity = O(rLogc)
//Space Complexity = O(1)
//Where r is the number of rows and c is the number of coloumns in the matrix.
//here time limit will exceed.
class Solution {
public:
    bool binarysearch(vector<vector<int>> matrix, int row,int target)
    {
        int low=0,high=matrix[0].size()-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(matrix[row][mid]==target)
                return true;
            else if(matrix[row][mid]<target)
                low=mid+1;
            else 
                high=mid-1;
        }
        return false;
    }
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int i ,j;
        for(i=0;i<matrix.size();i++)
        {
            if(binarysearch(matrix,i,target))
                return true;
        }
        return false;
    }
};


//Time Complexity = O(m+n)
//Space Complexity = O(1)
//Where m is the number of rows and n is the number of coloumns in the matrix.
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int i=0,j=matrix[0].size()-1;
        while(i<matrix.size() && j>=0)                                      //here we are starting our traversal from first row and last coloumn element.
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


//Time Complexity = O(m+n)
//Space Complexity = O(1)
//Where m is the number of rows and n is the number of coloumns in the matrix.
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int i=matrix.size()-1,j=0;
        while(j<matrix[0].size() && i>=0)                                   //here we are starting our traversal from last row and first coloumn element.
        {
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]>target)
                i--;
            else 
                j++;
        }
        return false;
    }
};
