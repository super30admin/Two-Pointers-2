// Time Complexity : O(m + n)
// Space Complexity : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //starting serach from top right element
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target)
                return true;
            //continue search to the bottom if target is greater
            if(matrix[i][j] < target)
                i++;
            //continue search to the left if target is lesser
            else
                j--;
        }
        return false;
    }
}