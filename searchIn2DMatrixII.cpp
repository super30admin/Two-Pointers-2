//time complexity:O(n^2)
//space complexity:O(1)
//executed on leetcode: yes
//approach:linear search
//any issues faced? yes

//approach 1:1 test case fails. gives TLE

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size()==0)
            return false;
        
        for(int i=0; i<matrix.size(); i++)
        {
            for(int j=0; j<matrix[0].size(); j++)
            {
                if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;
    }
};


//time complexity:O(n^2)
//space complexity:O(1)
//executed on leetcode: yes
//approach:binary search since rows and columns are sorted
//any issues faced? yes

//approach 2:only 9 test cases pass. Runtime error
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        for(int i=0; i<matrix.size(); i++)
        {
            for(int j=0; j<matrix[0].size(); j++)
            {
                
                int l=0;
                int r=matrix[0].size()-1;
                int t=0;
                int b=matrix.size();
                while(l<=r && t<=b)
                {
                    int midr=l+(r-l)/2;
                    int midc=t+(b-t)/2;
                    if(matrix[midr][midc]==target)
                        return true;
                    if(matrix[midr][midc]<target)
                    {
                        l=midr+1;
                        t=midc+1;
                    }
                    else
                    {
                        r=midr-1;
                        b=midc-1;
                    }
                }
            }
        }
        return false;
    }
};