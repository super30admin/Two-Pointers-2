//approach- B_Ftravel throught he entire array and do linear search- SC constant. 
//TC- O(m*n)

//Approach-2
//start from the right most upper corner. all the smaller values will be left to it, and greater values will be to the right of it, so keep increasing row if target is greater than value at index or decrease column in other case. 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        if(matrix == null || matrix.length ==0)    return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int r =0, c =n-1;
        
        while(r<m && c >=0)
        {
            if(target > matrix[r][c])
            {
                r++;
            }
            else if(target < matrix[r][c])
            {
                c--;
            }else
            {
                //equal 
                return true;
            }
        }
        return false;
    }
}



//Approach -3 
// start from the left most bottom corner

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        if(matrix == null || matrix.length ==0)    return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int r =m-1, c =0;
        
        while(r >=0 && c < n)
        {
            if(target > matrix[r][c])
            {
                c++;
            }
            else if(target < matrix[r][c])
            {
                r--;
            }else
            {
                //equal 
                return true;
            }
        }
        return false;
    }
}