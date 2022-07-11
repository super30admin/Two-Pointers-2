// T.C = O(n)
// S.C = O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        
        int count = 1;
        int j = 1;
        
        for(int i=1;i<nums.length;i++){
            // if dupplicate element present, increase count
            if(j<nums.length && nums[i] == nums[i-1]){
                count++;   
            }
            else{
                count=1;
            }
            // put the value of j in i after two duplicates
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
    
        return j;
    }
}