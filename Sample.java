
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//search in a 2D Matrix 2
//Time Complexity -> O(m+n) 
//Space Complexity -> O(1)
class Solution {
    //Using bottom left Corner
    public boolean searchMatrix(int[][] matrix, int target) {
        int nRows = matrix.length; int nCol = matrix[0].length;
        //Start from the right corner
        int i=nRows-1; int j = 0;
        while(i>=0 && j<nCol){
           if(matrix[i][j]==target) return true; 
           else if(matrix[i][j]>target){
              i--;
           }
           else{
               j++;
           }
        }
        return false;
    }
}
class Solution {
    //Using top right Corner
    public boolean searchMatrix(int[][] matrix, int target) {
        int nRows = matrix.length; int nCol = matrix[0].length;
        //Start from the right corner
        int i=0; int j = nCol - 1;
        while(i<nRows && j>=0){
           if(matrix[i][j]==target) return true; 
           else if(matrix[i][j]>target){
              j--;
           }
           else{
               i++;
           }
        }
        return false;
    }
}

//remove duplicates from Array
//Time Complexity -> O(n)
//Space Complexity -> O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int slow = 0;
        int count =1;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[slow] = nums[i];
                slow++;
            }

        }
        return slow;
        
    }
}

//Merge 2 Sorted Arrays
//Time Complexity -> O(m+n)
//Space Complexity -> O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1;
        int p2 = n -1;
        int index = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
                index--;
            }else{
                nums1[index] = nums2[p2];
                p2--;
                index--;
            }
        }

            if(p2>=0){
                while(p2>=0){
                    nums1[index] = nums2[p2];
                    p2--;
                    index--;
                }
            }
        
        
    }
}
