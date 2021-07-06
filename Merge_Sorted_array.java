/*
    Approach 1 : using Auxilary Array 

        time complexity : O(NLogN)
        space complexity : O(M+N)
        is worked on leetcode : YES

    Approach 2: using Two pointer
        Time Complexity : O(M+N)
        Space Complexity : O(1)
        is worked on leetcode : YES
*/

import java.util.Arrays;
public class Merge_Sorted_array{

    //1 8 9
    //2 3 4 6 7 
    public void merge_using_two_pointer(int [] nums1, int m, int[] nums2, int n){
    
        int i=m-1;
        int j=n-1;
        int k= m+n-1;
        while(i  >= 0 && j >= 0){
            if(nums2[j] >= nums1[i]){
                nums1[k] =  nums2[j];
                k--;
                j--;
            }
            else{
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        
        // while(i>0){
        //     nums1[k] = nums1[i];
        //     i--;
        //     k--;
        // }
        while(j>= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i =m;i< nums1.length;i++){
            nums1[i] =nums2[j];
            j++;
        }
       Arrays.sort(nums1);
       
   }
   public static void main(String[] args) {
       Merge_Sorted_array ob =  new Merge_Sorted_array();
       int[]nums1= {1,8,9,0,0,0,0,0};
       int[]nums2={2,3,4,6,7};
       ob.merge_using_two_pointer(nums1, 3, nums2, 5);
       for(int i=0;i<nums1.length;i++){
           System.out.println(nums1[i]);
       }
   }
}