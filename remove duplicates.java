//timecomplexity :-o(n^2);
//space complexity:-0(1);
//did it run on leetcode:- no
//any problem you faced:- got wrong answers and time limit exceeded
// your code with explanation:- as atmost duplicate count must be 2 iterating until prev element is same as present elemnt with count variable. if count>2 replacing with next one and shifting outer variable to j-1.







class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int count=0;
        int j=1;
        while(i<nums.length-1){
            while(nums[i]==nums[j]){
                j=j+1;
                count=count+1;
            }
            if(count>2){
                nums[j-1]=nums[j];
                  i=j-1;
            }
          i=j-1;
        }
  return i;  }
}