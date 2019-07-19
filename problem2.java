// Time complexity: o(n) 
//space complexity: 0(1)
// missing certain cases in leetcode.


// EXPLANATION:

//   Three pointers: one pointer in M, one pointer in LAST element of NUMS1, one pointer in LAST element of NUMS2

// IF: nums2's last value is greater than nums1's m value, assign value of nums2's last value to the nums1's last value
// decrement nums2's length -1, nums1 total length value

// ELSE case: assign value of nums2's last value to the nums1's M pointer value
// decrement nums2 length - 1, num1's M pointer value

public class problem2 {

    public static void mergedSortedArray(int[] nums1, int[] nums2, int m, int n) {
        
        int nums1TotalLength = nums1.length-1;
        m = m-1;
        int i = n-1;
        while(i>=0 && nums1TotalLength>=0 && m>=0) {
            if(nums2[i]>nums1[m]) {
                nums1[nums1TotalLength] = nums2[i];
                nums1TotalLength--;
                i--;
            }
            else {
                nums1[nums1TotalLength] = nums1[m];
                nums1[m] = 0;
                nums1TotalLength--;
                m--;
            }
        }
  
         for(int j=0;j<6;j++) {
        System.out.println(nums1[j]);      
   }
    }
   
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        mergedSortedArray(nums1, nums2, m, n);
    }
}