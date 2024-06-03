// Time Complexity :0(m+n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// use two pointer approach.
// p1 at the last element of nums1 and p2 at the last element of p2.
//use third pointer to keep track of elements when sorted
//if nums[p1] is greater move nums[p1] to nums[p3]
//decrement p1 and p3
//else move nums2[p2] to nums[p3] and decrement p2 and p3.
//continue untol both p1 and p2 are greater or equal to zero
//if elements in nums2 are still remaining, transfer them to nums as they are already sorted

// Your code here along with comments explaining your approach

public class MergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null ||nums1.length==0){
            return;
        }
        int p1=m-1;
        int p2 =n-1;
        int p3 =m+n-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p3]=nums1[p1];
                p1--;
                p3--;
            }else {
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
        }
        while(p2>=0){
            nums1[p3]=nums2[p2];
            p2--;
            p3--;
        }

    }
}
