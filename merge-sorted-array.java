
// Time Complexity :
O(3(m+n)) ==> O(m+n) where m and n are length of the input arrays 
// Space Complexity :
O(m) ==> new array of length m is created
// Did this code successfully run on Leetcode :
yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //copy elements from nums 1 to a new array
        int [] newNums = new int[m];
        for(int p=0;p<m;p++){
            newNums[p] = nums1[p];
        }
        
        int i=0;
        int j=0;
        int k=0;
        
        
        while(i<newNums.length && j<n){
            /*we are comparing elements from both the arrays 
            and incrementing the pointers accordingly
            */
            if(newNums[i] < nums2[j]){
                nums1[k]=newNums[i] ;
                i++;
                k++;
            }
            else{
                
               nums1[k] =nums2[j];
               j++;
               k++; 
            }
        }
        
        //If there are still elements in newNums array, this will be executed
        while(i<newNums.length){
          nums1[k]=newNums[i] ;
                i++;
                k++;
        }
        //If there are still elements in nums2 array, this will be executed
         while(j<n){
          nums1[k] =nums2[j];
               j++;
               k++; 
        }
        
        
    }
}