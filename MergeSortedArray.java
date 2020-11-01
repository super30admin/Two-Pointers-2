package S30.TwoPointers_2;

/*
Time Complexity : Put: O(m + n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int currIdx = m + n - 1;

        while(j >= 0 && i >= 0){

            if(nums1[i] > nums2[j]){
                nums1[currIdx--] = nums1[i];
                i--;
            }else{
                nums1[currIdx--] = nums2[j];
                j--;
            }
        }
        while(j >=0){
            nums1[currIdx--] = nums2[j--]; //// case when : A = [7,8,9,0,0,0], B = [4,5,6] or A = [0], B = [1] -- remember to do this residual array copy for all merging questions
        }

    }
}
