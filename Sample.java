//Problem 1
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
    
        int j= 1;
        int count =1; 
        int k=2;
        
        for(int i=1; i< nums.length; i++){
        if(nums[i] == nums[i-1])
        {
            count++;
        }
        else{
            count=1; //reset the count for new element
        }
        
        if(count<= k)
        {
            nums[j]=nums[i]; 
            j++;
        }
    }
        return j;
    }
}

//Problem 2
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1==null || nums2 ==null  && nums1.length==0 || nums2.length==0) return; 
        
        int p1=m-1; //pointer 1 to array1
        int p2= n-1; //pointer 2 to array2
        int index= (m+n)-1; //index in the array1 where elements are supposed to be added
            
        while(p1>=0 && p2>=0)
        {
           if(nums1[p1]>nums2[p2]){ //if the greater element is in array1
                nums1[index]= nums1[p1]; //put that in the index position  
                p1--; 
            }
            else{
               nums1[index]=nums2[p2]; //else put the other arrays element 
                p2--;
            }
              index--; 
        }
    
        while(p2>=0)
        {
            nums1[index] = nums2[p2]; //put any remaning elements into array1
            index--;
            p2--; 
        }
    }
}

//Problem 3
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m= matrix.length;
        int n= matrix[0].length;
        int i=0; 
        int j=n-1; //start with the top right most element 
        
        while(i<m && j>=0)
        {
            if(matrix[i][j]==target) return true; 
            else if(matrix[i][j] > target) j--; //move column if the target is present in that row
            else i++; //move row if not present 
        }
        return false;
    }
}