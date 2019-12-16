/*Time Complexity: O(m+n)
Space Complexity: O(1)
Did it run on Leetcode: Yes
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