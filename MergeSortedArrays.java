// Time Complexity : O(m+n) as we are iterating over the two arrays once
// Space Complexity : O(1) since no auxiliary data structure is used
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// we use 3 pointers - one keeps track of the end of the nums1[] arr, one keeps the highest element in nums1 and one for highest elements in num2
//keep adding larger of the two elemenst at the end of nums1[]
// Your code here along with comments explaining your approach
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m == 0){
            for(int i =0; i< m+n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        if(n == 0){
            return;
        }
        int high2 = n-1;
        int high1 = m-1;
        int end = m+n-1;

        while(end >= 0 && high2>=0){
            if(high1 <0){
                //copy over all the elements from nums2
                while(high2 >=0){
                    nums1[end--] = nums2[high2--];
                }
                break;
            }
            if(high2 >=0 && high1 >=0){
                if(nums2[high2] >= nums1[high1]){
                    nums1[end] = nums2[high2];
                    end--; high2--;
                }
                else{
                    nums1[end] = nums1[high1];
                    nums1[high1] = 0;
                    end--; high1--;

                }
            }
        }
    }
}
