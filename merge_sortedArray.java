//Time Complexity : O(N)
//No extra space required
//Solved using merge sort
//Always remember that whenever we will merge values we need atleast 2/3 while loops as once we reach the end of the array i or j will go to negative value and it will stop working .
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j =n-1;
        int k =m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else if (nums1[i]<nums2[j]) {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
            else if(nums1[i] == nums2[j]){
                nums1[k]=nums2[j];
                nums1[k-1]=nums1[i];
                j--;
                i--;
                k=k-2;


            }


        }
        while(i >= 0 && k >= 0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >= 0 && k >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}