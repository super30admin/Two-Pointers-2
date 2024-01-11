//Accepted on LT
//The idea is to have 2 pointer and move one count pointer and keep count of each element.
//use the slow pointer to add atmost 2 elelments
//Time should be O(n)
class Solution {
    public int removeDuplicates(int[] nums) {
        int counter=1;
        int slow = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                counter++;
            }
            else{
                
                counter = 1;
            }

            if(counter<=2){
                slow++;
                nums[slow] = nums[i];
                
            }
        }
        return slow+1 ;
        
    }
}