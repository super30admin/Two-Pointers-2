
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int i =1;
        int j =1;
        int count =1;
        while(j<nums.length){
            if(nums[j] == nums[j-1]){
            count++;
        }else{
                count = 1;
            }
                
        if(count<=2){
            nums[i] = nums[j];
            i++;
        }
        j++;
        }
       return i; 
    }
}

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n =matrix[0].length;
        int m = matrix.length;
        int i =0;
        int j = n-1;
       while(i < m && j >=0 ){
            int cElement = matrix[i][j];
           if(cElement == target){
               return true;
           }else if(target<cElement){
               j--;
           }else{
               i++; 
                
           }
             
       }
         return false;   
    }
     
    
}
/ Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>= 0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }

        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}