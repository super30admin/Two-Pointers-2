//Time - O(m+n)
//Space - O(1)
public class Search2DMatrixII {
    public boolean searchMatrix(int[][] nums, int target) {
        if(nums==null || nums.length==0) return false;

        int m = nums.length;
        int n = nums[0].length;
        int row = 0, col = n-1;

        while(row >= 0 && row < m && col >= 0 && col < n){
            if(nums[row][col] == target){
                return true;
            } else if(nums[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
}