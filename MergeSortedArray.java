class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p2 >=0 && p1 >=0){
            if(nums2[p2] >= nums1[p1]){
                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            }
            else if(nums1[p1] > nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
                p3--;
            }
            
        }

        while(p2>=0){
            nums1[p3] = nums2[p2];
            p2--; p3--;
        }
    }
}

/**


TC : O(m + n) --> Traversing Both Arrays 
SC : O(1)

Description : 


we need to start from the end, 3 pointers and send a bigger number to the end.  

Eg : Arr1 =  [1,7,8,0,0,0], Arr2 = [2,4,5] → First comparing with 8 & 5 (starting from last → One pointer at 8, One pointer at last 0 and one pointer at 5). 

If 8 is greater than 5 moving 8 to the last pointer and decreasing both pointers one step. If 1 is less than 5 then decreasing one pointer in the Array2 and first pointer in the Array 1, by moving 5 to 1st zeros place.

If the first array finishes first, put all the remaining elements inside the second array inside the first array without any comparisons. 

TC : O(m + n), SC : O(1). 
 */
