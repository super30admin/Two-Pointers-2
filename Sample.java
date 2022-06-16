//Problem-1
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: We need to remove the duplicates from the sorted array . At most an
//an element can repeat two times.Here we use two pointers approach to solve this problem. One to identify the repeating
//elements in the array and other to modify elements in the array.
// Your code here along with comments explaining your approach: Here we use two pointers called fast and the slow pointers
//fast pointer will check if its previous element is same and if so the increase the count by 1 and else set count to 1.
//We check whether the count is less than the given k or not if its less than k then we use slowpointer index to be replaced
//with fastpointer indexed element.
class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1;
        int slowPointer=1;
        if(nums.length<2) return nums.length;
        for(int fastPointer=1;fastPointer<nums.length;fastPointer++){
            if(nums[fastPointer-1]==nums[fastPointer]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[slowPointer]=nums[fastPointer];
                slowPointer++;
            }
        }
        return slowPointer;
    }
}



//Problem-2
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:Here we use two pointer approach to merge the sorted arrays.
// Your code here along with comments explaining your approach: we start at the end of each array and we check which element
//is greater we keep at the end and reduce the index. We repeat till any one of them is less than zero and check whether
//we have inserted all the ekements from the second array if not we will replace them at the beginning.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int idx=m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]<nums2[p2]){
                nums1[idx]=nums2[p2];
                p2--;
            }
            else{
                nums1[idx]=nums1[p1];
                p1--;
            }
            idx--;
        }
        while(p2>=0){
            nums1[idx]=nums2[p2];
            p2--;
            idx--;

        }
    }
}





//Problem-3
// Time Complexity :O(n)(not sure have doubt with Tc. But every iteration we are eliminating n-1 elements) so I guess its O(n).
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Your code here along with comments explaining your approach: we need to find an element from the 2d matrix.It has  been
//given the all the elements in each column and row are in increasing order. We start at end of the last column which means all
//the elements to its left are lesser and first row which means all the elements to its bottom are greater. if check with targetr
//if its greater we move bottom or if its lesser we move left . we move till we find the element.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;

        int m= matrix.length;
        int n= matrix[0].length;
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) j--;
            else i++;
        }
        return false;
    }

}