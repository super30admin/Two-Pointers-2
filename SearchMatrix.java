/**
## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
 
Time Complexity :   O (N*M) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (240. Search a 2D Matrix II)
Any problem you faced while coding this :       No
 */

class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int ptr1 = 0, ptr2 = n - 1;
        // start from top left corner element
        while(ptr1 < m && ptr2 >= 0){
            // if element found, return true
            if( matrix[ptr1][ptr2] == target)
                return true;
            // if greater value, then go left
            else if( matrix[ptr1][ptr2] > target){
                ptr2--;
            }
            // if greater value, then go down
            else{
                ptr1++;
            }
        }
        return false;
    }
    public static void main(String args[]) 
    { 
        SearchMatrix obj = new SearchMatrix();
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
        int target = 5;
        System.out.print(obj.searchMatrix(matrix, target));
    }
}