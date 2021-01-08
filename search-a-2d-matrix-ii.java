// Time Complexity : O(logn) n: size of matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// if last elent of a row is smaller than target then every element in row is smaller than target. so we ca discard whole row
// if first element of column is bigger than target then every elemnt will be bigger, so we can discard that column.
// keep doing that using binary dearcg untill you find target or you reach out of bound

// Your code here along with comments explaining your approach

// using binary search
public boolean searchMatrix(int[][] matrix, int target) {
    int min_i = 0;
    int max_j = matrix[0].length-1;
    while(min_i < matrix.length  && max_j >= 0){
        int l = min_i;
        int r = matrix.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            //System.out.println(l + " 1 " + r);
            if(matrix[mid][max_j] == target) return true;
            if(matrix[mid][max_j] > target){
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        min_i = l;
        if(min_i >= matrix.length) break;
        //System.out.println("min_i : "+ min_i);
        l = 0;
        r = max_j;
        while(l<=r){
            int mid = l + (r-l)/2;
            //System.out.println(l + " 2 " + r);
            if(matrix[min_i][mid] == target) return true;
            if(matrix[min_i][mid] > target){
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        max_j = r;
        //System.out.println("max_j : "+ max_j);
    }
    return false;
}

// using linear search

public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0) return false;

    int i = 0;
    int j = matrix[0].length-1;
    while(i < matrix.length && j>=0){
        //System.out.println(i+" "+j);
        if(matrix[i][j]<target){
            i++;
        } else if(matrix[i][j]>target){
            j--;
        } else {
            return true;
        }
    }
    return false;
}

// Time Complexity : O(n) n: size of matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// start from last element of first row. if element is less than target go to next row
// else go to previous column. 
// keep doing that using binary dearcg untill you find target or you reach out of bound

// Your code here along with comments explaining your approach

//using linear search
public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0) return false;

    int i = 0;
    int j = matrix[0].length-1;
    while(i < matrix.length && j>=0){
        //System.out.println(i+" "+j);
        if(matrix[i][j]<target){
            i++;
        } else if(matrix[i][j]>target){
            j--;
        } else {
            return true;
        }
    }
    return false;
}