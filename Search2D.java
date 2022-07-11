//Time Complexity: O(m+n).
//Space Complexity: O(1).


//The brute force approach will go through all the rows and the columns giving O(m*n).
//This problem has an interetsing approach where I follow left/bottom apporach. 

//smallar > go up
//larger > go right
//or
//smaller > go right
//larger > go down

//Whenever using two pointers place pointers properly. 



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        
        int row = 0;
        int col = matrix[0].length-1; //right column. 
        
        while(row < matrix.length && col >= 0){
            if(target > matrix[row][col])
                row++;
            else if(target < matrix[row][col])
                col--;
            else
                return true;
        }
        
        return false;
    }
}