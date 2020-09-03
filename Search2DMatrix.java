//Time Complexity: O(nlogn) n to scan each row in the 2D matrix and logn for the binary search
//Space Complexity: O(1)

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int index = 99999;
        for(int i=0; i<matrix.length; i++){
            index = search(matrix[i], target);
            System.out.println(index);
            if(index >= 0 && index < matrix[i].length){
                return true;
            }
        }
        return false;
    }
    
    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i+j)/2;
            if (nums[m] == target) 
                return m;
            if (nums[i] <= nums[m]) {
                if(nums[i] <= target && target <= nums[m])    
                    j = m-1;
                else
                    i = m+1;  
            }
            else{
               if(nums[m] <= target && target <= nums[j])    
                    i = m+1; 
                else
                    j = m-1;
            }
        }
        return -1;     
    }
    public static void main(String[] args) {
        int[][] nums = {{4,5,6},{7,0,1},{2,2,4}};
        int target = 0;
        System.out.println(searchMatrix(nums, target));
    }
}