
class Sample {

    // Time Complexity : O(N)
    // Space Complexity : o(1)
    // Did this code successfully run on Leetcode : Yes

    // Problem 1
    /**
     * 1. Take 2 pointers. i and j.
     * 2. j keeps track of all the elements and i is for keeping track of at max 2 duplicates in an array.
     * 3. value of count is checked if it is not more than 2.
     */

    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int i = 1, j = 1;
        int count = 1;
        
        while(j < nums.length) {
            if(nums[j] != nums[j-1]) {
                nums[i] = nums[j];
                i++;
                count = 1;
            }
            else {
                if(count < 2) {
                    nums[i] = nums[j];
                    i++;
                    count++;
                }
            }
            j++;
        }
        
        return i;
        
    }
    
    // Time Complexity :
    // Space Complexity :
    // Did this code successfully run on Leetcode :
    // Three line explanation of solution in plain english

    // Problem 2
    /**
     * 1. Take 2 pointers, starting from end of the both arrays.
     * 2. Compare the elements at the pointers and decrement accordingly.
     * 3. Maintain one more pointer from the end of the actual size of first array and decrement it everytime
     * while occupyiing maximum of the above 2 pointers.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0))
            return;
        
        int i = m-1, j = n-1;
        int k = nums1.length-1;
        
        while(i >= 0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        
        while(i >= 0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
        
    }
}