//Time COmplexity: O(n^2)
//Space Complexity: O(1)
//LeetCOde: Yes

//Traverse through all the elements and return the boolean

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i =0; i<matrix.length;i++){
            for(int j =0; i<matrix[0].length;i++){
                if(matrix[i][j]==target)return true;
        }
            
    }
        
        return true;
    }
}