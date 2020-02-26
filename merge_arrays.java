
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Find  last index of both the arrays.
//Start comparing the elements from boht the arrays from the end.
//Then put the new elemnt in first+second+1 index.
//DO next while loop to iterate and place second array elements in first.


// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //find last index of both the arrays
        int first = m-1, second = n-1;
        
        //loop to compare elements from both ends
        while(first >= 0 && second >= 0){
        	//element in first array is greater
            if(nums1[first] > nums2[second]){
                nums1[first+second+1] = nums1[first];
                first--;
            }else{ // element in second array is greater
                nums1[first+second+1] = nums2[second];
                second--;
            }
        }
        

        //loop to put second arrays lements in first, incase first is empty and second is not
        while(second >= 0){
                nums1[second] = nums2[second];
                second--;
        }
    }
}