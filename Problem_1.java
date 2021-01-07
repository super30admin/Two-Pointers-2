// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Below is the boor force approach for the question.In this I am using extra space as treemap to compute the array.
class Solution {
    public int removeDuplicates(int[] nums) {
        int length=0;
        TreeMap<Integer,Integer> hash=new TreeMap<Integer,Integer>();
        for(int i:nums){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i)+1);
            }else{
                hash.put(i,1);
            }
        }
        for(int i:hash.keySet()){
            if(hash.get(i)>=2){
                nums[length]=i;
                nums[length+1]=i;
                length=length+2;
            }else{
                nums[length]=i;
                length=length+1;
            }
        }
        return length;
    }
}

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Below is the boor force approach for the question.In this I am using extra space as treemap to compute the array.
