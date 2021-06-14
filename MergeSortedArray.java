//Time Complexity: O(M+N)
//Space Complexity: O(1)



public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pt1 = m - 1;
        int pt2 = n - 1;

        for(int mainPtr = m+n-1; mainPtr >= 0; mainPtr--){

            if(pt2 < 0)
                break;

            if(pt1 >= 0 && nums1[pt1] > nums2[pt2]){
                nums1[mainPtr] = nums1[pt1];
                pt1--;

            }else{                
                nums1[mainPtr] = nums2[pt2];
                pt2--;
            }             
        }
    }

}
