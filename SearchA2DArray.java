class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
        int j=n-1;


        while(i<m && j>=0){

            if(matrix[i][j]  == target)  return true;
             else if(matrix[i][j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}



/**
TC : O(m+n)
SC : O(1)


Description : 

In BruteForce, Search whole matrix TC : O(mn)

Another Solution, Starting from the top right corner or bottom left corner, if the number is bigger than the target going towards smaller number or if number is smaller than target going towards bigger number. 

TC : O(m + n), we can't start from top left or bottom right because In top left both the numbers will be greater and in bottom right both the numbers will be smaller. So we can't decide. 

Another approach, Binary search on each row o(m logn)






 */