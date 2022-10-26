package s30.arrays.twoPoinnters2;

// Time Complexity: O(m+n), m and n being the dimensions of the matrix
// Space Complexity: O(1);

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int midI = 0;
        int midJ = n-1;


        while(midI < m && midJ >=0){
            int ele = matrix[midI][midJ];

            if(ele == target) return true;

            else if(ele > target) midJ--;

            else midI++;
        }

        return false;

    }
    public static void main(String[] args) {

    }
}
