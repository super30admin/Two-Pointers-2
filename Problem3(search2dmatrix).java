/*Algorithm
    1. Initiate the location of pointers to point to the last row and first column of the matrix.
    2. If the value at the location is greater than target, move up.
    3. If the value at the location is less than the target, move right. If we find the element then return true else return false.
    
    Time Complexity: O(m+n)
    Space Complexity: O(1)
    
    Did the code run successfully on leetcode? Yes


*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length == 0)
            return false;
        
        int pointer1 = matrix.length-1, pointer2= 0;
        
        while(pointer1 >=0 && pointer2<matrix[0].length){
            if(matrix[pointer1][pointer2]==target)
                return true;
            else if(matrix[pointer1][pointer2]>target) //Case 1
                pointer1--;
            else //Case 2
                pointer2++;
        }
        
        return false;
        
    }
}