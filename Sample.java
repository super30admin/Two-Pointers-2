//===========PROBLEM 1: Remove duplicates from sorted array
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english : start from 2 pointers, one to passthrough array, one to store duplicate elements upto k,
// Store the fast element in slow, until you get new element and count is less than equal to k.
//return slow element

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int k=2;
        int slow=1;
        int fast=1;
        int count=1;
        while(fast<nums.length){
            if(nums[fast]==nums[fast-1]) // if same element as before-> increse count
                count++;
            else // new element, turn count as 1
                count=1; 
            if(count<=k){
                nums[slow++]=nums[fast++]; // count is yet to match k so change nums[slow to fast]
            }
            else
                fast++; //count greater than k, dont change slow, just increment fast as wr are ignoring it.
        }
        return slow; //slow starts with 1, so return last element. -> slow

        //2nd way of doing it
        // if(nums==null || nums.length==0) return 0;
        // int k=2;
        // int slow=1;
        // int count=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1])
        //         count++;
        //     else
        //         count=1;

        //     if(count<=k){
        //         nums[slow++]= nums[i];
        //     }
        // }
        // return slow;
    }
}


//===========PROBLEM 2: Merge Sorted Arrays
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : start from descending order so that we dont need extra array to keep nums1 array elements till m as it would have been overwritten otherwise
// if p1 is over, it doesnt matter as it is already in nums1, and is smaller than all remaining p2 elements. 
// put p2 in idx in reverse manner if p2>=0 after p1 is over. 

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int idx=m+n-1;
        int p1=m-1; //last element of first sorted array before 0
        int p2=n-1; // last element of second sorted array
        while(p1>=0 && p2>=0){ //run loop until p1 AND p2 in bounds
            if(nums1[p1] >= nums2[p2]) // if p1 greater, put element at p1 to idx
                nums1[idx--]=nums1[p1--];
            else
                nums1[idx--]=nums2[p2--]; // if p2 greater, put element at p2 to idx
        }
        //if p1 finishes first, it is fine as it is already in nums1 and is sorted and is less than elements remaining in p2.

        // if p2 >=0 means there are still elements to be put in nums1. as p1 is over we add all elements of p2 to idx in reverse order
        while(p2>=0){ //
            nums1[idx--]=nums2[p2--];
        }
    }
}


//===========PROBLEM 3: Search in Sorted Matrix ii
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : every column and every row is sorted, so start with corner elements.   
// cannot start with top left and bottom right elements as we need a definite decision onto which side to move 
// that decision can come if either row or column is ascending and other is descending in order.
// so we use bottom left and top right in this case (BOTH SOLUTIONS GIVEN BELOW)

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //solution with top right starting element
        int r=0;
        int c=matrix[0].length-1;

        while(c>=0 && r<matrix.length){ //keep traversal within bounds
            if(matrix[r][c]==target)return true;
            
            if(matrix[r][c]<target)r++; // if current element is less than target, move bottom row
            else c--; // if current element is more than target, move to prev column 
        }
        return false;

        //solution with bottom left starting element
        // int r=matrix.length-1;
        // int c=0;

        // while(r>=0 && c<matrix[0].length){
        //     if(matrix[r][c]==target)return true;
            
        //     if(matrix[r][c]<target)c++;
        //     else r--;
        // }
        // return false;
    }
}