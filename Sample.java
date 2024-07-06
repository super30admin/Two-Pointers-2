
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
using 2 pointer one slow pointer collecting output array.
The second point traversing the array, if for one element the count is less then or equal to 2
copy the elements to result using slow pointer.

*/

// Your code here along with comments explaining your approach

//Remove duplicates from sorted array
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int count =1;
        for(int i=1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            } else{
                count = 1;
            }
            if(count <=2){// copy the elements for output if condition is true
                slow++;
                nums[slow] = nums[i];
            }


        }
        return slow+1;
    }
}

// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
 using 3 pointers, 1 ptr at the end of nums1 at pointion m
 1 ptr at the end of nums1 at pointion m+n
 1 ptr at the end of nums2 at pointion n
 compare the ptr at m and n positions for greater element and fill num1 from end
 at m+n-1 using the ptr at m+n

*/

// Your code here along with comments explaining your approach
//Merge sorted array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int pr = m+n-1;//using to fill nums1 with mergered values
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] >= nums2[p2]){
                nums1[pr] = nums1[p1];//p1 is greater copy taht to pr position
                p1--; pr--;
            } else{
                nums1[pr] = nums2[p2];//p2 is greated copy to pr position
                p2--;pr--;
            }
        }
        while(p2 >= 0 ){//if p1 is outof bound means all nums1 elements found their intended position
            //still elements left in nums2.
            //copy 2nd array ele
            nums1[pr] = nums2[p2];
            pr--;p2--;
        }

    }

// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
 1 pointer at the top right position,
 if target is equal to element at the pointer, we found the element
 if target is greater decrese the column that is move pointer 1 element left.
 else move pointer downwards increaseing the row. untill u find the target.
 if index of row or column out of bound then the element not present.

*/

// Your code here along with comments explaining your approach



    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;int n = matrix[0].length;
            int r = 0; int c = n-1;
            int pt;
            while( r < m && c >=0){
                pt = matrix[r][c];
                if(pt == target){
                    return true;
                } else if(pt > target){
                    //decrease column
                    c--;

                } else {
                    //increase row
                    r++;

                }
            }
            return false;

        }
    }
}