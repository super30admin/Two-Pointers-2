//TC: O(m+n)
//SC: O(1)
//Leetcode: successful

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int add =m+n-1;
        int st1=m-1;
        int st2=n-1;
        while(st1>=0 && st2>=0){
            if(nums2[st2]>=nums1[st1]){
                nums1[add]= nums2[st2];
                st2--;
            }
            else
            {
                nums1[add]=nums1[st1];
                st1--;
            }
            add--;
        }
        while(st2>=0){   //we got st1<0 and there are elements from 2nd array that needs to be filled in 1st array
            //we dont check for st2<0 since we filled all the 2nd array elements and the elements from the 1st array are already sorted and are at correct places
            nums1[add] = nums2[st2];
            st2--;
            add--;
        }
    }
}