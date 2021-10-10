// Time Complexity :O(m + n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public void merge(int[] nums1, int m, int[] nums2, int n) {
    //base conditions
    if(nums1 == null || nums2 == null || n == 0) return;
    //i -> last element of nums1 before 0 starts
    //j -> last element of nums2
    int i = m - 1, j = n - 1;
    //index will indicate the place where my maximum value will be assigned
    int index = m + n - 1;
    
    while(i >= 0 && j >= 0){
    if(nums1[i] < nums2[j]){
       //filling the elements in num1 from the end
       //Comparing to find the greater value of the last elments in
        //num1 and num2
       nums1[index] = nums2[j];
        j--;
    }
    else{
        nums1[index] = nums1[i];
        i--;
        }
        index--;
    }
    //If j is exhausted, then we have covered all the elements
    //otherwise we have to fill in the elements from j(nums2)
    //in nums[i]
    while(j >= 0){
        nums1[index] = nums2[j];
        index--;
        j--;
    }
}