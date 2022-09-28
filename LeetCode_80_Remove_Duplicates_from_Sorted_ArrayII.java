//Approach1- B-F
//Take Hashmap, iterate through array and store key as index values and value as frequence/count. 
//iterate over the hashmap and put the values into array one by one until count <=2 
//TC- O(n)
//SC- O(n) - Hashmap

//Approach2- two pointer left and right
//left take cares of location
//right keeps moving
//when nums[right -1] == nums[right] we do count++;
//if count <=2, we replace the left indexvalue by right's. and increment left pointer. 
//else part will be just right pointer keep going with the for loop
//TC: O(n) - traversing throught the lemgth
//SC- O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length ==0) return 0;
		
		int left =1, count =1;
		
		for(int right =1; right < nums.length ; right++)
		{
			if(nums[right] == nums[right-1])
				count++;
			else
				count =1;
				
			if(count <=2)
			{
				nums[left] = nums[right];
				left++;
			}
			
		}
		return left;
	}
}