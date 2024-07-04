/**
 Approach: 3 pointers

 Working:
     initializing 3 pointers p1, p2, p3
     p1 - pointer to the end of the value in nums1
     p2 - pointer to the end of num2
     p3 - pointer to the end of num1 where the elements will be placed

     when both p1 and p2 are non-negative
         check if value in p1 > p2
            then place the value in p1 to p3, decrement p3 and p1
         else value in p2 is greater than p1
            place value in p2 tp p3 index, decrement p3 and p1
     if pointer 2 i.e p2 is greater than zero,
        copy the value in p2 to corresponding p3


 Time Complexity: O(m+n)
 Space Complexity: O(1)
 */

class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1 == null || nums1.length == 0) {
            return;
        }

        int p1=m-1;
        int p2=n-1;
        int p3 = m+n-1;

        while(p1>=0 && p2>=0) {

            if(nums1[p1] > nums2[p2]) {
                nums1[p3--] = nums1[p1--];
            }
            else {
                nums1[p3--] = nums2[p2--];
            }

        }
        //not check p1, since the array is already sorted, so the value will be place in correct order
        while(p2>=0) {
            nums1[p3--] = nums2[p2--];
        }

    }

}
