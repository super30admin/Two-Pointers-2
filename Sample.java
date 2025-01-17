/**********************PROBLEM-1*************/
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes

// Maintain a pointer k for the position to add elements nad return
    //iterate the nums array and increment count , if count<=2 keep adding elems at k

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int k=1,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[k]=nums[i];
                k++;
            }

        }
        return k;
    }
}

/**********************PROBLEM-2*************/
// Time Complexity : 0(m+n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :yes

// Take two pointers from the end of two arrays and third pointer as position
    //Iterating over the array include the elements in descending order exhaust the
    //second pointer if not zero
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums1 == null) {
            return;
        }
        int ptr1 = m - 1, ptr2 = n - 1, pos = m + n - 1;
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] >= nums2[ptr2]) {
                nums1[pos--] = nums1[ptr1--];
            } else {
                nums1[pos--] = nums2[ptr2--];
            }
        }
        while (ptr2 >= 0) {
            nums1[pos--] = nums2[ptr2--];
        }

    }
}

/**********************PROBLEM-3*************/
// Time Complexity : 0(m+n) m=rows,n=cols
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes


// Search the matrix by fixing a pivot which is incrementing in one direction
    // and decrementing in other untill we find the element or run out of loop
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length-1,m=matrix.length-1;
        int row=0,col=n;
        while(row<=m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}