
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach - we are starting from the end index,
//and we compare both element at m and n. And select whichever element is larger, add it to the
//end index. And decrement end idx everytime.


/**
 *  MergeLists : MergeLists
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 11, 2024)
 * @since : 1.0 (Nov 11, 2024)
 *
 */
 public class MergeLists {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int k = nums1.length-1;
     int i = m-1, j = n-1;
     while(i >= 0 || j >= 0){
      if(i >= 0 && j >=0){
       if(nums1[i] >= nums2[j]){
        nums1[k] = nums1[i];
        i--;
       }else{
        nums1[k] = nums2[j];
        j--;
       }
      }else if(i >= 0){
       nums1[k] = nums1[i];
       i--;
      }else{
       nums1[k] = nums2[j];
       j--;
      }
      k--;
     }
    }

}
