// It is given that each of the individual rows and columns are already in sorted order, we set our pointer to the top right of the matrix, and compare it with the target
// If the element is more than the target, we need to decrease the value, to decrease the value we need to move left in our column, 
// If we have to increase then we need to move down in our rows. 

// Time Complexity : O(m + n)
// Space Complexity : O(1)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int row = matrix.length, col = matrix[0].length;
        int i = 0, j = col - 1;

        while (i < row && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix search2dMatrix = new Search2DMatrix();
        List<int[][]> inputs = new ArrayList<>();
        List<Integer> targets = new ArrayList<>();
        Collections.addAll(inputs,
                new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                        { 18, 21, 23, 26, 30 } },
                new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                        { 18, 21, 23, 26, 30 } });
        Collections.addAll(targets, 5, 20);

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(search2dMatrix.searchMatrix(inputs.get(i), targets.get(i)));
        }
    }
}
