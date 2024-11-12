// Approach 1: Brute Force. Create a map with nums[i] and value as count. find the max element in the nums.
// create a loop of range max nums and lookup the map and get the values qual to target
// Time : O(n)+o(min+max)
// Space: O(n) 

// Approach 2: Two Pointers with slow and fast starting at 0 and count variable to track the count. slow pointer will try to stay
// at distinct element and fast pointer will be moving through nums to find the next unique element. since finding the dupes we will check nums[i-1]
// Time : O(n)
// Space: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length; //6
        int slow=0; // holds position for next unique elements
        int fast = 0; // iterates through the array to find the next unique element
        int count =0;
        int k=2;
        while(fast<n){
            // create the count
            if(fast>0 && nums[fast]==nums[fast-1]){
                count++;
            } else{
                count=1; // reset the counter
            }

            // validate the count and move the values at the pointer's
            if(count<=k){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}

// Approach : Three pointers. Slow pointer is the indicator of valid element and fast moves through the range
// prev keeps track of the last number
// time. : o(n)
// space: o(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        // number at zero index is considered as valid number
        int prev=0; // prev
        int slow = 1; // indicator
        int fast = 1; // iterating
        int flag =0;
        int n = nums.length;
        while(fast<n){
            if(nums[fast]==nums[prev]){
                // landed on a duplicate -  check if the first duplicate
                if(flag==0){
                    // put my valid number in slow
                    nums[slow]=nums[fast];
                    slow++;
                    fast++;
                    // after you find the duplicate change the flag 
                    flag=1;
                } else{
                    fast++;
                }
            } else{
                // landed on a new number
                prev=fast;
                nums[slow]=nums[fast];
                slow++;
                fast++;
                flag=0; // not a duplicate
            }
        }
        return slow;
    }
}

