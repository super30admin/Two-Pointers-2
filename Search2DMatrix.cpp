//firstly as we know each row of the matrix is sorted we can apply the binary search on each row

// for each row
// we will calculate the mid if the target < mid , end = mid, start =mid
// but the time complexity is O(nlogn)

// one more thing to notice is that the column are sorted as well so that we can start from either left
//bottom or right top
// and at each step we can check if the target is less than the value (right top) we decrement the col
// if it is greater we increment the raw
class Solution {
private:
    bool binarySearch(vector<int>&nums,int target)
    {
        int start = 0;
        int end  = nums.size()-1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return true;
            else if(target < nums[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return false;
    }
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int r = 0;
        int c = matrix[0].size()-1;

        while(r < matrix.size() && c >=0)
        {
            if(target < matrix[r][c])
                c--;
            else if(target > matrix[r][c])
                r++;
            else
                return true;
        }
        return false;
    }
};
// Time complexity for this O(M+n)