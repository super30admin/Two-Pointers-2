// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Two pointer approach from last element. compare arrays from last and keep max element from end of m+n-1 index.
//Keep incrementing the index.
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n2 = n-1, m1 = m-1, last = m+n-1;
        while(n2>=0 && m1>=0){
            if(nums2[n2] >= nums1[m1])
                nums1[last--] = nums2[n2--];
            else
                nums1[last--] = nums1[m1--];
        }
        while(n2>=0){
            nums1[last--] = nums2[n2--];
        }
    }
}
