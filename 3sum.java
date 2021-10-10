//timecomplexity :-o(n^3);
//space complexity:-0(n);
//did it run on leetcode:- yes
//any problem you faced:- got wrong answers and time limit exceeded
// your code with explanation:- keeping first index fixed and remaining two numbers must come such that sum =-nums[i] ,if previous index is same or got required num in order to remove it keeping one more while loop untill nums are different.
// is sum is greater decrementing high, if sum is smaller incrementing low if sum is equal incrementing low and decrementing high.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-2; i++){
            
            if(i == 0 || ( i > 0 && nums[i] != nums[i-1])){
                
                int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
                
                while(lo < hi){
                    
                    if(nums[lo] + nums[hi] == sum){
                        ans.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        
                        while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo < hi && nums[hi] == nums[hi-1]) hi--;
                        
                        lo++;
                        hi--;
                }
                else if(nums[lo] + nums[hi] < sum) lo++;
                else hi--;
                }
            }
        }
        return ans;
    }
}
        
           
        
        