
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//o(n) time with constant space

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int slow = 1; int count = 1;
        for(int i = 1 ; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{

                count = 1;

            }
            if(count<3){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int i = m+n-1;

        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1]> nums2[ptr2]){
                nums1[i] = nums1[ptr1];
                ptr1--;
            }else{
                nums1[i] = nums2[ptr2];
                ptr2--;
            }


            i--;
        }
        while(ptr2>=0){
            nums1[i] = nums2[ptr2];
            ptr2--; i--;
        }
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length; int n = matrix[0].length;

        int i = 0; int j = n-1;

        while(i < m && j >=0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}