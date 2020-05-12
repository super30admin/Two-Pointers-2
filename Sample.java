
//merge sorted array
//Time o(n) n is the length of the array nums1
//space o(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return; 
        int i = m+n-1, ptr1 = m-1, ptr2 = n-1;
        while(i>=0 && ptr1>=0 && ptr2>=0){
            
            if (nums1[ptr1] > nums2[ptr2]){
                nums1[i--] = nums1[ptr1--];
            }
            else {
                nums1[i--] = nums2[ptr2--];
            }
        }
        while(ptr2>=0){
            nums1[i--] = nums2[ptr2--];
        }
    }
}

//remove duplicates
//time o(n) n - length of the given array
//space o(1)

class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return 0;
        int slowPtr = 0, fastPtr = 1;
        boolean flag = false;
        int m = nums.length;
        
        while(fastPtr < m){
            if(nums[slowPtr] == nums[fastPtr]){
                if(!flag){
                    flag = true;
                    slowPtr++;
                    nums[slowPtr] = nums[fastPtr];
                    fastPtr++;
                }
                else{
                    flag = false;
                    while(fastPtr < m && nums[fastPtr] == nums[slowPtr])
                        fastPtr++;
                } 
            }
            else{
                flag = false;
                slowPtr++;
                nums[slowPtr] = nums[fastPtr];
                fastPtr++;
            }
        }
      return slowPtr+1;  
    }
}

//Time o(m+n) 
//space o(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        //m - no of rows, n - no of cols
        int m = matrix.length, n = matrix[0].length;
        int r = 0, c = n-1;
        
        while(r<m && c >= 0){
            if(matrix[r][c] == target)
                return true;
            else if( matrix[r][c] > target ){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}

