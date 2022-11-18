Problem 88- merge sorted array

// Time Complexity :O(m+n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //if(m==0 || n==0) return;
        int p1,p2,p3;
        p1=m-1;
        p2=n-1;
        p3=m+n-1;
        
        while(p1>=0 && p2>=0)
        {
            if(nums2[p2]>nums1[p1])
            {
                nums1[p3]=nums2[p2];
                p2--;
                //p3--;
            }
            else 
            {
                nums1[p3]=nums1[p1];
                p1--;
                //p3--;
            }
            p3--;
        }
        
        while(p2>=0)
        {
            nums1[p3]=nums2[p2];
            p3--;
            p2--;
        }
        
    }
}










Problem 240- Search in s 2d matrix II

// Time Complexity :O(mlogn)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row,column;
        row=matrix.length;
        column=matrix[0].length;
        int r=0;
        int c=column-1;
        while(r<row && c>=0)
        {    
            if(matrix[r][c]==target)
            {
                return true;
            }
            else if(matrix[r][c]<target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
            return false;
    }
}





Problem 80- remove duplicates from sorted array

// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes

class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=1;
        int p2=1;
        int count=1;
        
        for(p1=1; p1<nums.length; p1++)
        {
            if(nums[p1]==nums[p1-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=2)
            {
                nums[p2]=nums[p1];
                p2++;
            }
        }
        return p2;
        
    }
}
