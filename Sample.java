// ==============================Search in Matrix=========================
// Time Complexity : O(n + m ) traveling rows and colums to find the number
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// Since the matrix is sorted in colm and row we take advantage of column decreasing and row increasing ends
// Take two pointers - Row = 0 and Column = matrix[0].length. 
// MOve till we reach the column were current is less than target element then move rows to reach target

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 )
            return false;
        
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        int row = 0; int col = m;
        while(row <= n && col >= 0 ){
            
            if(matrix[row][col] == target){
             return true;   
            }
            
            if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        
        return false;
    }
}
// =======================Remove more than 2 Duplicate======================
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// We have 2 pointers fast and slow. case 1 - When fast and slow matches we reached allowed 2 elements so set the flag to true;
// Since its sorted if fast and slow matches again and the flag is true, increment fast until it doesnt match with slow element.
// case 2 - fast and slow doest match increment slow and swap fast and slow.
// Retrun slow
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0)
            return 0;
        
        int slow = 0 ; int fast = 1;
        int result_length = 0;
        int repeat_count = 1;
        
        while(fast < nums.length){
            if(nums[slow] == nums[fast]){
                if(repeat_count ==1){
                     repeat_count++;
                     slow++;
                     nums[slow] = nums[fast];
                     fast++;
                }
               
                while(fast < nums.length && nums[fast] == nums[fast-1]){
                    fast++;
                    // repeat_count = 1; //Reset the count to 
                }
            }else{
                repeat_count =1;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return slow+1;
        
        
        
        
        
//         boolean flag = false;
//         while(fast <= nums.length-1){
//             // case 1 - slow and fast are equal for first time.
//             if(nums[slow] == nums[fast]){
//                 if(!flag){
//                 flag = false;
//                 slow++;
//                 nums[slow] = nums[fast];
//                 fast++;  
//                 } 
//                 // Case 2 - if there is a repetiton after slow and fast checks
//                 while(fast < nums.length && nums[fast] == nums[fast-1]){ 
//                     fast++;
                  
//                 }
                
//             }
//             // case 3  - slow and fAST ARE nt the same
//             else{
//                 flag = true;
                
//                 slow++;
               
//                 nums[slow] = nums[fast];
//                  fast++;
//                 flag = false;
//             }
//         }
//         return slow+1;
    }
}

// =======================Merge 2 sorted array inplace====================
// Time Complexity : O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// We are given with 2 sorted arrays. Set two pointers statring from end. Compare last 2 elemnts and replace nums1 last element with the bigger ones.
// if ponter1 reached 0 earlier then fill nums1 with all values from nums2.
// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n ==0 )
            return;
        int pntr1 = m-1 ; int pntr2 = n-1;
        int i = m+n-1;
        while(pntr1 >= 0  && pntr2 >= 0 ){
            if(nums1[pntr1] > nums2[pntr2]){
                nums1[i] = nums1[pntr1];
                pntr1--;
                i--;
            }else{
                nums1[i] = nums2[pntr2];
                pntr2--;
                i--;
            }
             // i--;
        }
        while(pntr2 >= 0){
            nums1[i] = nums2[pntr2];
            pntr2--;
            i--;
        }
        
    }
}

