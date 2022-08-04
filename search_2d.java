//TC: O(m+n)
//SC: O(1)
//Leetcode successful:

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
        int n = matrix[0].length;
        //int st1 = matrix[0][n-1];
        int i = 0;
        int j=n-1;
        while(i<m && j>=0){
        if(matrix[i][j]==target)
            return true;
        else if(matrix[i][j] > target)
            j--;
            else i++;
            }
        return false;
    
    }
}

//TC: O(mlogn)
//SC: O(1)
//Leetcode successful:

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //Binary search for each row
        int m = matrix.length;
        int n = matrix[0].length;
        boolean bool = false;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target && matrix[i][n-1]>= target)
            {int result = binary(matrix[i],0,n-1,target);
             if(result== target){
                bool = true;
                break;  
             }
             else 
                 continue;
                
            }
        }
        return bool;        
    }
    private int binary(int [] matrix , int low, int high, int target){
        while(low<=high){
        int mid = low+ (high-low)/2;
        if(matrix[mid]==target){
            return matrix[mid];
        }
            else if(matrix[mid]>target){
                high = mid-1;
            }
            else 
                low = mid+1;
        }
        return -1;
    }
}
