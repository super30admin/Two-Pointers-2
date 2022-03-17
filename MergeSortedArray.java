// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Two pointers from the end comparing and inserting the max of the 2 elements in nums1 & nums2

// Your code here along with comments explaining your approach
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int max = m + n -1;
        int p1 = m - 1;
        int p2 = n - 1;
        
        while(p1>=0 && p2 >=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[max] = nums1[p1];
                max--;
                p1--;
            }else{
                nums1[max] = nums2[p2];
                max--;
                p2--;   
            }
        }
        
        while(p2>=0){
                nums1[max] = nums2[p2];
                max--;
                p2--;               
        }
        
    }
}
