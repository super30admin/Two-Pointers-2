//Time Complexity: O(n+m)
//Space Complexity: O(1)
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0)
            return;
        int ptr1 = m-1, ptr2 = n-1;
        int idx = nums1.length-1; // this can be m + n
        
        while(ptr1 >= 0 && ptr2 >= 0)
        {
            if(nums1[ptr1] > nums2[ptr2])
            {
                nums1[idx] = nums1[ptr1--];
            }
            else
            {
                nums1[idx] = nums2[ptr2--];
            }
            idx--;
        }
        
        while(ptr2 >= 0) // left over elements of ptr2 since ptr1 will already be sorted
        {
            nums1[idx--] = nums2[ptr2--];
        }
    }
}