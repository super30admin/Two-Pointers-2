
//Prob-1 : remove-duplicates-from-sorted-array-ii
// Time Complexity : O(n) where n is the num of elements in the given array
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/**
Using slow and fast pointer pattern to remove the duplicates.
As soon as the second duplicate element is seen at pointer slow,
slow+1 will be equal to the next unique element in the array.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int slow = 0;
        int fast = slow+1;
        boolean flag = false;
        while(fast < nums.length){
            
            if(nums[slow] == nums[fast]){
                if(!flag){
                    flag = true; // flagging that the duplicate is seen once
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                }else{ 
                    while(fast < nums.length && nums[fast] == nums[slow]) fast++;
                }
            }else{ // if two numbers are not equal
                    flag = false; // flagging that the this num hasn't been seen before
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
            }  
        }

        return slow+1; // slow will be sitting at the duplicate/non-duplicate index
    }
}

//prob-2: merge-sorted-array
// Time Complexity :O(n) where n is the num of elements in the given array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/**
Using three pointer pattern. Where the p1 and p2 is starting from the index m-1 and n-1 respectively.And pointer i will go from right to left.
A bigger number between p1 and p2 will be placed on the ith location and this pattern will continue from right to left of the array.

*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
if(n == 0) return;        
        int i = nums1.length-1;
        int p1 = m-1;
        int p2 = n-1;
        
        while( p1 >=0 && p2 >=0){
            
            if(nums2[p2] > nums1[p1]){
                nums1[i] = nums2[p2];
                p2--;
            }else{
                nums1[i] = nums1[p1];
                p1--;
            }
                i --;
        }
        
            while(p2 >= 0 ){
                    nums1[i] = nums2[p2];
                    i --;
                    p2--;  
            }
    }
}

//prob-3: search-a-2d-matrix-ii
// Time Complexity :O(m+n) where m is the number of rows and n is the len of columns
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/** 
Using the concept of binary search on rows and cols. 
Two pointers can be used that will be starting from the last row or first row and last column(top right).
if a number is greater than target, decrement the column otherwise decrement the row. 
*/
class Solution {
    

    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix == null || matrix.length == 0){ return false;}
        
        int row =0;
        int col = matrix[0].length-1;
        
        while(row < matrix.length && col >= 0){
            
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                col--;
            }else if(matrix[row][col] < target){
                row++;
            }
        }
        
        return false;
        
    }
}
