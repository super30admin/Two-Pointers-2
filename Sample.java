import java.util.*;

//Problem1
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution1 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 1;
        int count = 1;
        
        
        for(int i = 1; i < nums.length; i++){

            //if the previous element is equal then increase the count
            if(nums[i] == nums[i-1]){
                count++;
            }

            //otherwise set the count to 1, because its a new element
            else{
                count = 1;
            }

            //this will replace the current element to nums[i] 
            //but it won't matter untill the count  <= 2
            //after the count becomes 3
            //then the duplicate will be replaced by the next element which is not a duplicate
            //because j will stop incrementing
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
//Problem2
// Time Complexity :
// Space Complexity :

class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null){
            return;
        }
        
        int i = m - 1; int j = n - 1;
        int end = m + n -1;
        
        //while both nums1 && nums2 are inbounds
        while(i >=0 && j >= 0){

            //if last element of nums1 > last element of nums2
            if(nums1[i] > nums2[j]){

                //then put the last element of nums1 at nums1[m+n-1]
                nums1[end] = nums1[i];

                //move to the next element on left in nums1
                i--;
            }
            else {

                //else put the last element of nums2 at nums1[m+n-1]
                nums1[end] = nums2[j];

                //move to the next element on left in nums2
                j--;
            }

            //move to the left from the last index in nums1
            end--;
        }
        
        //after the above loop
        //if nums2 is still in bounds then do this loop
        while(j >= 0){

            //put the last element of nums2 at nums1[m+n-1]
            nums1[end] = nums2[j];

            //move to the next element on left in nums2
            j--;

            //move to the left from the last index in nums1
            end--;
        }
    }
}

//Problem3
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0){
            return false;
        }
        
        int n = matrix.length; int m = matrix[0].length;
        int i = 0; int j= m-1;
        
        //the loop till the edges of the matrix
        while(i < n && j >=0){

            //if the element in the matrix is equal to the target
            //then we have the target
            if(matrix[i][j] == target){
                return true;
            }

            //otherwise if the element is smaller than the target
            //then  move left in the row
            else if(matrix[i][j] < target){
                i++;
            }

            //but if the element is larger than the target
            //then move down the coloumn
            else
                j--;
        }
        return false;
    }
}
