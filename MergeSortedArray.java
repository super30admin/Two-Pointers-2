// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Take 3 pointer one at end of num1 and other 2 at the end of numbers in the two arrays
//compare the pointers in the two arrays and plac the bigger element at the end of num1
//Repeat this process while decrementing the pointers

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p3 = nums1.length-1;
        int p2 = n-1;
        
        while(p3>=0){
            if(p1 < 0){
                nums1[p3--] = nums2[p2--];
            }
            else if(p2 < 0){
                nums1[p3--] = nums1[p1--];
            }
            else if(nums1[p1] > nums2[p2]){
                nums1[p3--] = nums1[p1--];   
            }
            else{
                nums1[p3--] = nums2[p2--];
            }
        }
        
    }
}