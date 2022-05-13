//Remove Duplicates from Sorted Array II
//Time Complexity : O(N)
//Space Complexuty :O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums==null) return 0;
      //start from index 1
       int slow =1;
        //initialize count 
        int count = 1;
        //traverse list
        for(int i=1 ;i<nums.length ;i++){
            //if element is equal to previous number increase count
            if(nums[i]==nums[i-1]){
                count++;
            }
            //else reset count
            else count=1;
            //if count is less than or equal to 2
            if(count<=2){
                //element where slow is pointed
                nums[slow]=nums[i];
                //increase slow pointer
                slow++;
            }
        }
        //return the index of slow which is pointing to sorted with length k of each element +1
        return slow;
    }
}

//Merge Sorted Array
//Time Complexity : O(m+n)
//Space Complexity : O(1)
class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null) return;
        if(nums2==null) return;
        //p1 pointing to element previous to 0 in nums1
        int p1 = m-1;
        //p2 pointing to last element of nums2
        int p2 = n-1;
        //to store in nums1 array starting from last
        int i = m+n-1;
        //while both arrays than elements
        while(p1 >= 0 && p2 >= 0){
          //put greater element in the last
            if(nums1[p1] >= nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            }
            else{
                nums1[i]=nums2[p2];
                p2--;
            }
            i--;
        }
        //still after sorting some elements remain in nums2 copy that to nums1
        while(p2>=0){
            nums1[i]=nums2[p2];
            p2--;
            i--;
        }
       
        }
        }

//Search a 2D Matrix II
//Time Complexity : O(m+n)
//Space Complexity : O(1)
class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix ==null)return false;
        int m = matrix.length;
        int n = matrix[0].length;
        //two pointers i at first element j at last element
        int i = 0; int j = n-1;
        while(i < m && j>=0){
            //if the target is found
            if(matrix[i][j]==target) return true;
            //if the element is greater than target move left
            if(matrix[i][j]>target){
                j--;
            }
            //element less than target move down
            else i++;
            
        }
        //if target not found
        return false;
    }
}
    
