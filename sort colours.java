//timecomplexity :-o(n);
//space complexity:-0(1);
//did it run on leetcode:- yes
//any problem you faced:- got wrong answer manytimes.
// your code with explanation:- as there are only three colours if the element is 2 swapping to the right most and decrementing, if it is zero swping with previous. 
//simply keeping low as 0 boundaries and high as 2 boundary.






class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int current=0;
        while(current<=high){
            if(nums[current]==2){
                int temp=nums[current];
                nums[current]=nums[high];
                nums[high]=temp;
                high=high-1;
            }
            else if(nums[current]==0){
                int temp1=nums[current];
                nums[current]=nums[low];
                nums[low]=temp1;
                low=low+1;
                current=current+1;
            }
            else{
                current=current+1;
            }
        }
        
        
        
    }
}