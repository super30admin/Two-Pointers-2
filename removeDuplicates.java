// Time Complexity : O(2n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) <= k) {
                result.add(num);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }

        return result.size();
    }
}
