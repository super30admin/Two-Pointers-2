// Time Complexity : O(m+n)
//      m: elements in 1st array
//      n: elements in 2nd array
// Space Complexity :O(1)
//      using inplace
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Using the descending approach.
// We will start by placing the highest element at the end of the array.
// The high pointer points to end of the 1st array(Bigger array).
// There will be a constant difference between m and high, so we wont lose information.
class Problem1 {

    /** Merge two arrays */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // pointer to end of the array
        int high = n+m-1;
        // pointer to 1st array's end
        m--;
        // pointer to 2nd array's end
        n--;
        
        // both are in range
        while(m>=0 && n>=0 ){
            
            // check the max and add to end of the array
            if(nums1[m]> nums2[n]){
                nums1[high] = nums1[m];
                // update 1st pointer
                m--;
            }else{
                nums1[high] = nums2[n];
                // update 2nd pointer
                n--;
            }
            // decrease high
            high--;
        }
        
        // 2nd array is not empty
        while(n>=0){
            nums1[high--] = nums2[n--];
        }
        
    }
}