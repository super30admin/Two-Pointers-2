
// Time Complexity : i have to iterate through all the element to check the dublicate, and if array contains N element then time 
// taken would be o(N), here i am deleteing element so it would take o(N) so time coplexity = o(N) + o(N) = o(N)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int removeDuplicates(int[] nums) {
     
        
        int i=1, count = 1, len = nums.length;
        
        while(i < len){
            
            if(nums[i] == nums[i-1]){
                count++;
                if(count > 2){
                    this.remove(nums,i);
                    i--;
                    len--;
                }
            }else{
                count = 1;
            }
            i++;
            
        }  
        return len;
    }
    
    private int[] remove(int[] arr, int index){
        
        
        for(int i=index+1; i< arr.length; i++){
            arr[i-1] = arr[i];
        }
        return arr;
    }
    
}