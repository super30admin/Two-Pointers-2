public class Search2DMatrix{

    public boolean searchMatrix(int[][] nums, int target){

        int m = nums.length;
        int n = nums[0].length;

        if(nums == null || n == 0) return false;

        //start from top right corner (or bottom left)
        int i = 0, j = n-1;

        while(i < m && j >= 0){ // O(m+n)

            if(nums[i][j] == target) return true;

            // if number is less than target, move to next row
            else if(nums[i][j] < target){
                i++;
            }
            // if number is greater than target, move to previous column
            else{
                j--;
            }
        }
        return false;
    }

    /*
    Time Complexity = O(m +n) - moving by one row or one column in each step
    Space Complexity = O(1)
    */

    public static void main(String[] args){

        Search2DMatrix object = new Search2DMatrix();

        int[][] arr = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22},
                {10,13,14,17,24}, {18,21,23,26,30}};

        int lb = 14;

        boolean result = object.searchMatrix(arr, lb);

        System.out.println("Is the target found in the matrix? "+ result);
    }

}
