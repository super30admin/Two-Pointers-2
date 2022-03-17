//Time Complexity O(n)
//Space Complecity O(1)
//Leetcode tested

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0) return;
        if(nums2.length == 1 && nums1.length == 1){
            nums1[0]=nums2[0];
            return;
        }
        int index = nums1.length-1;
        int num1Index = (nums1.length - nums2.length)-1;
        int num2Index = nums2.length-1;
        while(num2Index>=0) {
            if(num1Index>=0 && nums1[num1Index] > nums2[num2Index]){
                nums1[index] = nums1[num1Index];
                nums1[num1Index]=0;
                index--;
                num1Index--;
            }else{
                nums1[index] = nums2[num2Index];
                index--;
                num2Index--;
            }
        }
    }
}
