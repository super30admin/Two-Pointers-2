// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Solution {
    public boolean circularArrayLoop(int[] nums) {
        boolean found = false;

        for ( int n=0; n<nums.length; n++ ) {
            Integer ps = n;
            Integer pf = next(nums, 0, n);
            int dir = nums[n];

            while ( ps != null && pf != null && ps != pf ) {
                ps = next(nums, dir, ps); //slow gets the next value
                pf = next(nums, dir, next(nums, dir, pf)); //fast gets the value after next
            }

            if ( ps != null && ps == pf ) { //when the two pointers meet, circular array is present
                found = true;
                break;
            }
        }

        return found;
    }

    Integer next(int[] nums, int dir, Integer pos) {
        if ( pos == null ) return null; // null, return null
        if ( dir * nums[pos] < 0 ) return null; // change in direction, return null

        Integer next = (pos + nums[pos]) % nums.length;
        if ( next < 0 ) next += nums.length; // wrap negative

        if ( next == pos ) next = null; // self-pointer, return null
        return next;
    }
}
