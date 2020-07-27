/* Time complexity: O(n), where n is the size of the smaller array
space complexity: O(1)

1. Given that array1 is the bigger array, start comparing the elements from last position
and keep appending it in the later positions of the bigger array.
2. Keep doing this until you iterate through the entire array 1 or array2
3. In case any elements are left to be sorted, in array2, just append it in front of array1.

*/
class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int pt1 = m-1;
        int pt2 = n-1;
        int index = m+n-1;
        while(pt1 >= 0 && pt2 >= 0){
            if(nums1[pt1] > num2[pt2]){
                nums1[index] = num1[pt1];
                pt1--;
            }
            else{                
                nums1[index] = num2[pt2];
                pt2--;            
            }
            index--;
        }
        while(pt2 >= 0){
            nums1[index] = nums2[pt2];
            pt2--;
            index--;
        }
    }
}