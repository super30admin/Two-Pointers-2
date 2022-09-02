/*Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.ArrayList;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1=m-1;
    int p2=nums1.length-1;
    int p3=n-1;

    while(p3>=0){
        if(p1==-1){
            while(p3>=0){
            nums1[p2]=nums2[p3];
            p2--;
            p3--;
            }
            break;
        }
        if(nums2[p3]>nums1[p1]){
            nums1[p2]=nums2[p3];
            p2--;
            p3--;
        }
        else{
            nums1[p2]=nums1[p1];
            p2--;
            p1--;
        }
    }
    }
}