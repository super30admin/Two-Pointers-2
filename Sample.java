
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//We use two pointer technique to check if the number appeas more than twice.
//We will use one pointer to move across the array and the other to replace the duplicates

class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 1; // this will be a writer pointer
        int count = 1; //count for checking atmost 2 occurances
        for(int j=1; j< nums.length; j++){
            if(nums[j] == nums[j-1]){
                count++;
            }else{
                count = 1; //reset to 1 if the number are not same
            }

            if(count<3){
                nums[i++] = nums[j]; //here we replace the element if it appears more than 2
            }
        }
        return i; // we return the final index which was overridden
    }

}


// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// We use two pointers here and we start both the pointers from end of the input arrays
// We compare values from two arrays and replace the greater at the end of the array with the idx pointer
//Lastly there is only chance that nums2 array is not at all written in nums1 and hence we loop it at the end
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;

        while(p1>=0 && p2>=0){
            if(nums2[p2] > nums1[p1]){
                nums1[idx] = nums2[p2];
                p2--;

            }else{
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }

        while(p2>=0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}



// Time Complexity : O(N+M) -> N is rows and M is length of column
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// The fact that rows and columns are sorted, if we llok at the row and the element is < than target we decrement row
// and if the target is greater than target we go left of the current column

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0;
        int c = n-1;

        while(r<m && c>=0){

            if(matrix[r][c] == target) return true;
            else if(matrix[r][c]> target) c--;
            else r++;
        }
        return false;
    }

}
