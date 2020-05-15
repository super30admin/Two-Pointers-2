
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
       
        int slow = 2, fast = 2;
        for( fast = 2; fast < nums.length ; fast++){
            if(nums[fast] != nums[slow-2])
                nums[slow++] = nums[fast];
        }
        return slow;
    }
    
    
}

/*
Time Complexity : O(N)
Space Complexity : O(1)

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        
        int first = m-1;
        int second = n-1;
        int index = m + n -1;
        
    while(second >= 0 && first >= 0){
    nums1[index--] = nums1[first] > nums2[second] ? nums1[first--] : nums2[second--]; 
    }
    
    while(second>=0)
    nums1[index--] = nums2[second--];     
        
    }
}

/*
Time Complexity = O(N)
Space Complexity = O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = matrix.length-1;
        int j=0;
        
        while(i>=0 && j<=matrix[0].length-1){
        if(matrix[i][j] > target)
            i--;
        else if(matrix[i][j] < target)
            j++;
        else
            return true;
        }
    return false;
        
    }
}

/*
Time Complexity : O(N)
Space Complexity : O(N)
*/


            



