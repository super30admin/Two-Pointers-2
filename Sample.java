
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Approach:1. Have ptr1 at the end of array1, ptr2 at end of array2 and an index at the end of the whole array1.
        // 2. Check which element is greater between array1 and array2's pointer and store them from last index of array 1.
        // 3. Now check if all elements from both the arrays are emptied into array1 and sorted correctly.
        int ptr1=m-1;
        int ptr2=n-1;
        int midx=m+n-1;
        
        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1]>nums2[ptr2]){
                nums1[midx]=nums1[ptr1];
                ptr1--;
            }
            else{
                nums1[midx]=nums2[ptr2];
                ptr2--;
            }
            midx--;
        }
        while(ptr2>=0){
            nums1[midx]=nums2[ptr2];
            ptr2--;
            midx--;
        }
    }
}

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        // Approach:1. Assign slow ptr at 0 and a fast ptr at 1 and also a count variable to keep count of numbers occurence in the array and iterate over the entire array.
        //     2. Increase the count by 1 if the elements match between one and another or else keep the ount as 1 as there is new number in the array. Check if the count is 2 as given in the question. If it is 2 then increase the slow pointer by 1 and store the new number at that location.
        //         3. Finally return the place of slow pointer.
        int slow=0,fast=1,cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                cnt++;
            else
                cnt=1;
            if(cnt<=2){
                slow++;
                nums[slow]=nums[i];
            }
        }
        return slow+1;
    }
}

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a=matrix.length;
        int b=matrix[0].length;
        int r=0,c=b-1;
        while(r<a && c>=0){
            if(matrix[r][c]==target)
                return true;
            else if(matrix[r][c]<target)
                r++;
            else
                c--;
        }
        return false;
    }
}