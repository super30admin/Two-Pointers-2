
//Problem 1
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int count=1;
        int j=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                count++;
            }
            else{
                count=1;
            }
            if(count<=2)
            {
                nums[j]=nums[i];
                j++;
            }
        }
return j;
    }
}

//Problem 2
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       //if(m==0) return;
       int p1=m-1;
       int p2=n-1;
       int p3=m+n-1;
       while(p1>=0 &&p2>=0)
    {
        nums1[p3]=Math.max(nums1[p1],nums2[p2]);
        p3--;
        if(nums1[p1]>nums2[p2])
        {
            p1--;
        }
        else{
            p2--;
        }
    }
    while(p2>=0)
    {
        nums1[p3]=nums2[p2];
        p3--;
        p2--;
    }
    }
}
//Problem 3
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)
        {
            return false;

        }
        int m=matrix.length;
        int n=matrix[0].length;
        int row=0;
        int col=n-1;
        while(row<m && col>=0)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(target>matrix[row][col])
            {
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}