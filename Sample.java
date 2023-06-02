class Solution {
    public int removeDuplicates(int[] nums) {
        //if(nums.length == 1)return 0;
        int i = 1;
        int j = 1;
        int count = 1;
        while(j < nums.length){
            if(nums[j] == nums[j-1]){
                count++;
                
            }else{
                count =1;
            }
            if(count <= 2){
                nums[i] = nums[j];
                i++;
            }
            j++;
                
        }
        return i;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n==0)return;
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;
        
        while(i>=0 && j>=0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }else{
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n-1;
        while(row<m && col>=0){
            if(matrix[row][col] < target){
                row++;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                return true;
            }
        }
        return false;
    }
}
