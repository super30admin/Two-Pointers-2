
// Time Complexity :O(n)
// Space Complexity :O(1)
class Solution {
    
    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;
        
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                
                count++;
                
            } else {
                
                count = 1;
            }
            

            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
----------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int i=m+n-1;
        int p1=m-1;int p2=n-1;
        while(p1>=0&&p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[i]=nums1[p1];
                p1--;
            }
            else
            {
                nums1[i]=nums2[p2];
                p2--;
            }
            i--;
        }
        while(p2>=0)
        {
                            nums1[i]=nums2[p2];
            p2--;i--;
        }
    }
}
----------------------------------------------------------------------
//Time Complexity:O(n+m)
//Space:O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else { 
                return true;
            }
        }

        return false;
    }
}