//time complexity : in worst case nlogn
//space complexity : O(1)
//leet code execution :  execution was fine, submission failure encountered
// steps: will iterate the first array from empty spaces and fill'em with nums2. then used arrays.sort for sorting.
import java.util.Arrays; 
class MergeSortedArray88{

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

       for(int i=m; i<nums1.length;i++){
           nums1[i]=nums2[i-n];
       }
       Arrays.sort(nums1);   
       for (int ii : nums1) {
           System.out.println(ii);
       }
    
    }




    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        MergeSortedArray88 msa = new MergeSortedArray88();
        msa.merge(nums1, 3, nums2, 3);
    }
}