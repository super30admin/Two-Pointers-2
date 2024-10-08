
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


//brute force approach copy num2 to num1 from m+1 to m+n then sort num1 TC- O(n) + (m+n)log(m+n) SC-O(1)
//if we take one more array of size m compare new array and num2 and fill new array TC-O((m+n) SC- O(M)
// 3 pointer-- start from end of num1 and num2 compare last elements and start putting at end of num1 M+n 
//TC-O(m+n)
// if 0s in num1 are towards to end start from end compare bigger ele first but if 0s are towards to begining 
//start with smaller element first


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       
        //if(m==0) nums1 = nums2;

        int p1 = m-1;
        int p2 = n -1;
        int t = m+n -1;

        while(p1 >= 0 && p2 >=0){
           
            if(nums1[p1] > nums2[p2]){
                nums1[t] = nums1[p1];
                p1--;
               
            } else{
                nums1[t] = nums2[p2];
                p2--;
             
            }
            t--;

        }

        while(p2 >= 0){
            nums1[t] = nums2[p2];
            t--;
            p2--;
        }




    }
}