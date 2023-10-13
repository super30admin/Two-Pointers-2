// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No

//Approach: Since both arrays are sorted and nums1 is already have enough space for nums2 data, create 2 pointers pointing to
//actual data of nums1 (using m-1) and nums2 (using n-1) compare the elements copy them to nums1.  Make sure to copy the
//leftover elements from nums2 to num1.

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =  m-1;
        int j =  n-1;
        int k = nums1.length-1;
        while(j>=0){
            if(i >0 && nums1[i] > nums2[j]){
                nums1[k] =  nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }

        }
        while(j>=0){
            nums1[j]=nums2[j];
            j-- ;
        }
    }
    public static void main(String[] args){
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int m = 1; int n = 1;
        merge(nums1,m, nums2, n);
    }

}
