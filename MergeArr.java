// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
    We use two pointers and a print pointer. We swap the bigger elements in the print pointer position.
    We decrement the bigger pointer and print pointer.

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;
        
        while(p2 >= 0 && p1 >=0){
            if(nums1[p1] > nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
                index--;
            } else{
                nums1[index] = nums2[p2];
                p2--;
                index--;
            }
        }
        
        while(p2>=0){
            nums1[index] = nums2[p2];
                p2--;
                index--;
        }
        
        
        
    }
}