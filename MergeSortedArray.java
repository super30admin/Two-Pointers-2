package s30Coding;

//Time Complexity :- O(m+n) where m and n are the lengths of both the array

// Space Complexity :- O(1) since no extra space use

//Logic : 2 pointer approach to traverse through the arrays and another pointer to place the sorted numbers in the first array.

public class MergeSortedArray {
public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1;
        int j=nums2.length-1;
        int k=nums1.length-1;
        while(i >= 0 && j>= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while(i >= 0){
            nums1[k--]=nums1[i--];
        }
        while(j >= 0){
            nums1[k--]=nums2[j--];
        }
    }
}
