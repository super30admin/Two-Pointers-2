
// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, count = 1, n = nums.length;
         while (i < n) { // loop and count the number of times the number is occured in the array.
             if (nums[i] == nums[i - 1]) {
                count++;
                if(count>2){ // if it is greater than 2 times, then we remove that element by using a function.
                    this.removeElement(nums,i); 
                    i--;
                    n--;

                }
            }
            else {
                 count = 1;  
            }
              i++;
        }
        return n;
    }

    public int[] removeElement(int[] arr, int index){
        // we remove the element by moving the numbers one index before till end of the array.
        for(int i=index+1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        return arr;
    }
}