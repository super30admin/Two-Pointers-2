// Time Complexity :0(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// 1. Using three pointers each at nums1, nums2 and index pointer at nums1 to insert the value from backwards.
// 2. If the one of the array is empty put the values from the another array at index pointer
// 3. If both the array have values then compare the value at nums1[m] and nums2[n] for max value and the insert that value at index pointer at nums1 array.
// Your code here along with comments explaining your approach

public void merge(int[] nums1, int m, int[] nums2, int n) {
    // decrementing m and n to get each array's last index;
    m--;
    n--;
    // Additonal pointer which will put the value in nums1 starting from the last index of nums1
    int index = nums1.length - 1;

    // Traversing the nums1 array from the end
    while(index >= 0){
        // if nums1 is empty then put values from nums2 at index pointer
        if(m < 0){
            nums1[index] = nums2[n--];
        }
        // if nums2 is empty then put values from nums1 at the index pointer
        else if(n < 0){
            nums1[index] = nums1[m--];
        }
        // If both the arrays have values than compare max values at nums1 and nums2 then put that at the index pointer at nums1
        else{
            if(nums1[m] > nums2[n]){
                nums1[index] = nums1[m--];
            }
            else{
                nums1[index] = nums2[n--];
            }
        }
        // Decrement the index pointer after putting the value at nums1
        index--;
    }
}