class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = m > n ? m : n ;
        int i = 0;
        int x = 0;
        int l = 0;
        
        while(i < m) {
            map.put(nums1[i], map.getOrDefault(nums1[i],0) + 1);
            i++;
        }
        while(x < n) {
            map.put(nums2[x], map.getOrDefault(nums2[x],0) + 1);
            x++;
        }
            
        
        // for(Integer j : map.keySet()) {
        //     System.out.println(j + " "+ map.get(j));
        // }
        
        // int[] result = new int[len1 + len2];
        for(Integer j : map.keySet()) {
            for(int k = 0; k < map.get(j); k++) {
                nums1[l] = j;
                l++ ;
            }
            
        }
        Arrays.sort(nums1);
    }
}

//2 pointer approach for optimization
