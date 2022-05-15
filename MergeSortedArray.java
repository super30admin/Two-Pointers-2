
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// I'm using three pointers, pointer1 refers to largest element in nums1 and pointer2 points to largest element in nums2
// zeroPointer points to the index where numbers can replaces based on the conditions
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int zeroPointer = nums1.length - 1;
        while(zeroPointer >= 0){
            if(pointer1 < 0){
                nums1[zeroPointer] = nums2[pointer2];
                pointer2--;
                zeroPointer--;
            }
            else if(pointer2 < 0){
                break;
            }
            else if(nums1[pointer1] > nums2[pointer2]){
                nums1[zeroPointer] = nums1[pointer1];
                pointer1--;
                zeroPointer--;
            }
            else{
                nums1[zeroPointer] = nums2[pointer2];
                pointer2--;
                zeroPointer--;
            }
        }
        
    }
}