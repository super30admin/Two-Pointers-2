
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english
-> compare from end index, m & n
-> add to original array when greater
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;
        int i = nums1.length-1;

        while(p1>=0 && p2>=0){

            if(nums2[p2]>nums1[p1]){
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }else{
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }

        }

        while(p2>=0 && i>=0){ //since p1 will reach 0 index first because we check it for <=, p2 will not so check here again
            nums1[i] = nums2[p2];
            i--;
            p2--;
        }
    }
}