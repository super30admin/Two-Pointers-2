/*
TC --> O(m*logn)
SC --> O(1)
 */
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int j = matrix[0].length - 1;
        int left_val = 0;
        int right_val = 0;
        for (int i = 0; i < matrix.length; i++) {
            left_val = matrix[i][0];
            right_val = matrix[i][j];
            if (target >= left_val && target <= right_val) {
                if (binSearch(matrix[i], target)) {
                    return true;
                }

            }//if

        }//for

        return false;
    }

    public boolean binSearch(int[] data, int target) {
        int l = 0;
        int r = data.length;
        int mid = l + (r - l) / 2;
        //System.out.println(data[mid]);
        while (l <= r) {
            //System.out.println(data[mid]);
            mid = l + (r - l) / 2;
            if (data[mid] == target) {
                return true;
            } else if (target > data[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }//while
        return false;
    }
}
