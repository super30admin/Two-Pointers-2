package TwoPointers2;
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

import java.util.ArrayList;

// Your code here along with comments explaining your approach
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int rIdx = m+n-1;
        while(m>0 && n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[rIdx] = nums1[m-1];
                m--;
            } else{
                nums1[rIdx] = nums2[n-1];
                n--;
            }
            rIdx--;
        }
        while(n>0){
            nums1[rIdx] = nums2[n-1];
            n--;
            rIdx--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        new MergeSortedArray().merge(nums1, 3, new int[]{2,5,6}, 3);
        System.out.println(new ArrayList<Integer>() {{ for (int i :  nums1) add(i); }});
    }
}
