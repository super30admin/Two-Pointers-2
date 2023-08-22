// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.*;

public class mergeSortedArray {

     public void merge(int[] nums1, int m, int[] nums2, int n) {
      int p1 = m-1; // pointer at end of m 
      int p2 = n-1; //pointer at end of n
      int p3 = m+n-1; //pointer at end of m+n
      while(p1 >= 0 && p2 >= 0){
         if(nums2[p2] > nums1[p1]){
              nums1[p3] = nums2[p2];
              p2--;
          } else{
              nums1[p3] = nums1[p1];
              p1--;
          }
          p3--;
      }
      //there are 2 cases , if nums2 pointer goes out first then nums1 is already sorted
      //but if nums1 pointer goes out first and there are still elements in nums2 then we have to copy those from nums2 to nums 1 and thus below code
      while(p2>=0){
          nums1[p3] = nums2[p2];
          p2--;
          p3--;
      }
    }

    public static void main(String[] args) {
        mergeSortedArray ts = new mergeSortedArray();
        int[] m1= {1,2,3,0,0,0};
        int[] m2=  {2,5,6};
        int[] m3= {1};
        int[] m4= {};
        int[] m5= {0};
        int[] m6= {1};
        ts.merge(m1,3,m2,3);
        ts.merge(m3,1,m4,0);
        ts.merge(m5,0,m6,1);
        System.out.println(Arrays.toString(m1));// ans = [1,2,2,3,5,6]
        System.out.println(Arrays.toString(m3));// ans = [1]
        System.out.println(Arrays.toString(m5));// ans = [1]
    }
}
