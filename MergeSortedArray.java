/**
We start using 3 pointers. 
One pointer points to last nums1
Second poinnter points to first array's last value
Third pointer points to last index of second Array

Comapre and add accordingly

TC-O(Log(n+m)), SC-O(1)
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;
        int first = m-1;
        int second = n-1;

        while(last>=0 && first>=0 && second >=0){
            if(nums1[first]>nums2[second]){
                nums1[last--]=nums1[first--];
            }
            else {
                nums1[last--]=nums2[second--];
            }
        }
        while(second>=0){
            nums1[last--]=nums2[second--];
        }
      
    }
}