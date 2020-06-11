//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1; // to count the starting value which will be missed as we are starting i from 1
        int j = 1; // initialize j same as i
        for(int i=1;i<nums.length;i++) // starting i at 1 and traversing till end of array
        {
            if(nums[i] == nums[i-1]) // if the value at previous index is same as current
                count++; // increase count
            else
                count = 1; // else go back to default 1 as a diff value encountered
            
            if(count <= 2) // as soon as the count becomes more than 2
            { 
                nums[j] = nums[i]; // we put value at i (valid value) at the duplicate value index i.e j
                j++; 
                // j represents the index where the duplicate is found so we place the curr value for count<=2 at j
                // then increment j as we have placed a value at the position
            }
        }
        
        return j; // j will give the length of the new array
    }
}

//https://leetcode.com/problems/merge-sorted-array/
// Time Complexity : O(n+m)
// Space Complexity : O(n+m)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       List<Integer> list = new ArrayList<>();
        int i = 0 , j = 0; // i for nums1 and j for nums2
        while(i<m && j<n) // traversing till one of them is traversed fully
        {
            if(nums1[i]<nums2[j]) // checking if value at i at nums1 is less than j at nums2
            {
               list.add(nums1[i]); // if it is add nums1 at i to list
                i++; // increment i
            }
            else
            {
                list.add(nums2[j]); // add nums2 at j to list
                j++; // increment j
            }
                
        }
        
       while(i<m) // if i has not reached to end i.e element left
       {
           list.add(nums1[i]); //add them to list
           i++;
       }
        
       while(j<n) // if j has not reached to end i.e element left
       {
           list.add(nums2[j]); //add them to list
           j++;
       }
       
        i=0;
    for(int num: list)
    {
        nums1[i] = num; // add elements of list to nums1
        i++;
    }
       
    }
}

// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {            
      int i = m-1; // to track end of nums1
      int j = n-1; // to track end of nums2
      int k = m+n-1; // to track the output array end
        
        while(k>=0 && j>=0 && i>=0) // while all are in bound
        {
            if(nums2[j] > nums1[i]) // if value at j > i
            {
              nums1[k] = nums2[j]; // placing largest value at k
                k--; // decrementing k and j
                j--;
            }
            else
            {
                nums1[k] = nums1[i]; // placing largest value at k
                k--; // decrementing k and i
                i--;
            }
                
        }
        
        while(j>=0 && k>=0) // if elements left in nums2 and j has not reached 0
        {
            nums1[k] = nums2[j]; // put in nums1
            k--; // decrementing k and j
            j--;
        }
        
        while(i>=0 && k>=0) // if elements left in nums1 and i has not reached 0
        {
            nums1[k] = nums1[i]; // put in nums1
            k--; // decrementing k and i
            i--;
        }
        
    }
}

//https://leetcode.com/problems/search-a-2d-matrix-ii/
// Time Complexity : O(n+m) as we are traversing the length of row and column and not all elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix.length==0 || matrix==null)
           return false;

        int n=matrix.length;
        int m = matrix[0].length;
        int r = n-1; // starting at the left bottom corner ( or can start from right top)
        int c = 0; 
        //we choose these two corners since we can go towards a direction distinctly if value is greater or less than target
        while(r>=0 && c<m)
        {
            if(matrix[r][c] == target) // if value found
            {
                return true;
            }
            else if(matrix[r][c]> target) // if curr value greater than target
            {
                r--; // go up
            }
            else
            {
                c++; // go right
            }
        }
        return false; // if the element does not exist, the pointers will go out of bounds and the loop will terminate and we return false
    }
}