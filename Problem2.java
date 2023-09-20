

//T.C  : O(m+n)
//S.C : O(1)
// Passed all Test cases on Leetcode : Yes
// Any issues faced while executing the code : No

public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ind = m+n-1;
        int i = m-1, j =n-1;
        while(i >=0 && j>=0){
            if(nums1[i] <= nums2[j]){
                nums1[ind--] = nums2[j];
                j--;
            }else{
                nums1[ind--] = nums1[i];
                i--;
            }
        }
        while(j >=0){
            nums1[ind--] = nums2[j];
            j--;
        }

    }
}
