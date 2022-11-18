/*
Time Complexity -->
O(n)

Space Complexity -->
O(1) since we are changing the same array
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        int count = 1;
        if(nums.length==1){
            return 1;
        }
        else{
            while (i<nums.length){
                if(nums[i]==nums[i-1]){
                    
                    count+=1;
                    
                    if(count<=2){
                        nums[j] = nums[i];
                        j+=1;
                        i+=1;
                    }
                    else{
                        i+=1;
                    }
                    
                    
                }//if adjacents are same
                
                else{  //if adjacents are not equal
                    nums[j]=nums[i];
                    count=1;
                    j+=1;
                    i+=1;
                    
                }
            }//while
        }
        
        return j;
    }
}