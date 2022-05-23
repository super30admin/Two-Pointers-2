// O(nlogn) time complexity: n terms, each no greater than logn
// O(1) space

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        
        int shorterDim = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < shorterDim; i++){
            boolean vertFound = binarySearch(matrix, target, i, true);
            boolean horFound = binarySearch(matrix, target, i, false);
            if (vertFound || horFound){
                return true;
            }
        }
        return false;
    }
    
    private boolean binarySearch(int[][] matrix, int target, int start, boolean vertical){
        int lo = start;
        int hi = vertical ? matrix[0].length - 1 : matrix.length - 1;
        
        while (hi >= lo){
            int mid = (lo + hi) / 2;
            if (vertical){
                if (matrix[start][mid] < target){
                    lo = mid + 1;
                }
                else if (matrix[start][mid] > target){
                    hi = mid - 1;
                }
                else {
                    return true;
                }
            } else{
                if (matrix[mid][start] < target){
                    lo = mid + 1;
                }
                else if (matrix[mid][start] > target){
                    hi = mid - 1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}