// Time Complexity :O(m+n)m=size of nums1, n=size of nums2
// Space Complexity :O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Since 2 arrays arr sorted we try to place largest element at the end
// Comparison continues until both pointers ran out of range
//if 2nd array runs out of range , need not do anything as 1st array is already sorted

// Your code here along with comments explaining your approach
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0||nums2==null)
            return;
        int ptr1=m-1;
        int ptr2=n-1;
        int i=m+n-1;
        //copy elements until both pointers are out of bound
        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1]<nums2[ptr2]){
                nums1[i]=nums2[ptr2];
                ptr2--;
            }
            else{
                nums1[i]=nums1[ptr1];
                ptr1--;
            }
            i--;
        }
        // if there are still elements in nums2 just copy them to nums1 
        // need not check for nums1 because it is already sorted.
        while(ptr2>=0){
            nums1[i]=nums2[ptr2];
            ptr2--;
            i--;
        }
        return;
    }
}