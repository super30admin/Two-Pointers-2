//Time complexity = O(m+n)
//Space complexity = O(1)
//Brute force=We can do in Binary search if it is sorted since we can do using multiple binary search then time complexity =O(m+n).Can we do BS for columns but not for rows .

//Optimal approach:If target number to compare value is > then move down else move left direction or can do in sorted order.If it goes outside the bound then here we conclude the target value not found.
//2 Direction--->1.looking for larger value then move down
//2.looking for smaller value then move left.Its time complexity O(m+n) becoz not touching the all elements from the given array so number of rows plus coulmns .we can do in 2 approaches 1.top right and 2.bottom left.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        //bottom left approach --> row=m-1 then col = 0
        int r =m-1 , c= 0;
        while(r>=0 && c<n){
            if(target>matrix[r][c]){
                c++;
            }else if(target<matrix[r][c]){
                r--;
            } else{
                return true;
            }
        }
       return false;
    }
}