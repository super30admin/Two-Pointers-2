import java.util.Arrays;

public class Search2DMatrix_2 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;

        while(i<m && j >=0){
            int ele = matrix[i][j]; // start at 1st row last column

            if(ele == target){
                return true;
            }else if(target < ele){ // if target is less than
                //1st row at jth column, move to column left
                j--;
            }else{
                i++; // if target is > ele, that means exists in that colum,
                //so we can search in that columnn
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("Found element 5 in given matrix : " + searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 5));
    }

}
