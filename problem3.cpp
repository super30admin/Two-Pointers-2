// time : o(n) and space o(1)
//2pointer
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
     
        
        int count = 1;
        int slow =  1;
        int fast = 1;
        int n = nums.size();
        
        while(n> fast) {
            
            if( nums[fast] == nums[fast-1]) {
                count++;
            }  else {
                count = 1;
                
            } 
            
            if(count <=2) {
                    nums[slow] = nums[fast];
                 slow++;
             }
              fast++;
        }
        
        return slow;
    }
};