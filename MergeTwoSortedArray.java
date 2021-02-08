// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//We are comparing the last elements of both the arrays and the greater element we are putting at the end of
//array of nums1 and will repeat the process

// Your code here along with comments explaining your approach
public class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==0||nums2.length==0){
            return;
        }
        
        int p1 = m-1;
        int p2 = n-1;
        int p = nums1.length;
        
        for(int i = p-1;i>=0;i--){
            if (p2 < 0) {
                break;
            }
            
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i] = nums1[p1--];
            }else{
                nums1[i] = nums2[p2--];
            }
        }
        
    }
}
