// Time Complexity - O(m+n)
// Space Complexity O(1)
// Ran on leetcode Yes
// Any problems faced: No

public class Searchin2dMatrix {
    public boolean searchMatrix(int [][] matrix, int target){

        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0; // stat from the first row
        int j = cols -1; // start from last bottom element- last coloumn

        while(i< rows && j>=0){
            if(matrix[i][j] == target){
                return true;
            } else if (matrix[i][j] > target){
                j--;
            } else {
                i++;
            }

        }
        return false;
    }

    public static void main(String[] args){
        Searchin2dMatrix solution = new Searchin2dMatrix();
        int [][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}

        };
        int target = 5;
        System.out.println("Target"  + target  + "found" + solution.searchMatrix(matrix, target));

        System.out.println("Target"  + target  + "found" + solution.searchMatrix(matrix, target));
    }

}
