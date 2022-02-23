//Time Complexity: O(log(m+n))
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// reduce this problem to binary search
// consider first row and last col as one array, we can observe that all items are sorted
// so compare with mid and shift left or down  

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n= matrix[0].length;
        
        //represent row number as r and col number as c
        
        //initially we start with first row last item (0,n-1)
        int r=0,c=n-1;
        
        //while r and c are within limits 
        while(r<m && c>=0) {
            
            //our element will always be at the intersection of r and c
            int mid = matrix[r][c];
            
            if (mid == target) {
                return true;
            } 
            
            if(target < mid) { //in case target less than mid
                c--; //we move left --> that is prev col
            } else {
                r++; // we move down --> to next row
            }
            
        }
        
        //we have not found the element
        return false;
    }
}