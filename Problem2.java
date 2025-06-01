//Problem 88 : Merge Sorted Array
//Solved successfully on leetcode and faced no issues
//Time complexity : O(n) Space complexity : O(1)

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1] < nums2[p2]){
                nums1[idx] = nums2[p2];
                p2--;
            }
            else{
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }
        //copy remaining elements from nums2 to nums1 if there are any when p1 at nums 1 goes to negative index
        while(p2>=0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }

    }


    // Approach 2 : TC : O(m+n) - traversing over both arrays , SC = O(m+n) - temp array of length m +n
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int[] temp = new int[m+n];
    //     int i = 0;
    //     int j = 0;
    //     int k = 0;
    //     while(i<m && j<n){
    //         if(nums1[i] < nums2[j]){
    //             temp[k++] = nums1[i++];
    //         }
    //         else{
    //             temp[k++] = nums2[j++];
                
    //         }
    //     }
    //     while(i<m){temp[k++] = nums1[i++];}
    //     while(j<n){temp[k++] = nums2[j++];}
    //     for(int l = 0 ; l < m+n ; l++){
    //         nums1[l] = temp[l]; 
    //     }
    // }



    //Approach 1 : TC : O(m+n)*log(m+n) SC = O(1)
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     for(int i = 0  ; i < n ; i++){
    //         nums1[m+i] = nums2[i];

    //     }
    //     Arrays.sort(nums1);
    // }

}