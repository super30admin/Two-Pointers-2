// Time Complexity : O(M+N) M-length of nums1 and N length of nums2
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//As both the arrays are sorted, we will compare the max value in arr1 with max val in arr2.
//The max among two is put into the last index of arr1 and pointer decremented. 
//If max is from arr2, j is decremented else i gets decremented. 


public class MergeSortArrays {

    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n){

        int i = m - 1, j = n - 1, R = m + n - 1;

        while(i >= 0 && j>= 0){
            if(nums1[i] <= nums2[j]){
                nums1[R--] = nums2[j--];
            }else{
                nums1[R--] = nums1[i--];
            }
        }
        while( j>= 0){
            nums1[R--] = nums2[j--];
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,5,6,0,0,0};
        int[] nums2 = {2,3,4};
        mergeArrays(nums1, 3, nums2, 3);
        for(int num : nums1){
            System.out.print(num+" ");
        }
    }
    
}
