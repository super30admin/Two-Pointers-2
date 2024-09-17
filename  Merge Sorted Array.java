
// Time Complexity :o(m+n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int resptr=m+n-1;
        int firstptr=m-1;
        int secptr=n-1;   
        while (secptr >= 0 && firstptr>=0){
            if(nums1[firstptr]<nums2[secptr]){
                nums1[resptr]=nums2[secptr];
                System.out.println("update second"+nums2[secptr]);
                secptr--;
                resptr--;
            }else{
                 nums1[resptr]=nums1[firstptr];
                 System.out.println("add first"+nums1[firstptr]);
                firstptr--; 
                resptr--;
            }
        }
        while(secptr >= 0 ){
            nums1[resptr]=nums2[secptr];
            resptr--;
            secptr--;
        }
    }
}
//solution 2
 // public void merge(int[] nums1, int m, int[] nums2, int n) {
 //       for(int i=m,j=0;i<nums1.length && j<n;i++,j++){
 //     nums1[i]=nums2[j];      
 //       }
 //        Arrays.sort(nums1);
 //    }