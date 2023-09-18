class MergeSortArrayThreePointers {
    //Using three pointers.
    //TC will be O(m + n), as traversing once
    //SC will be O(1), as no extra space
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2 == null || nums2.length==0){   //base Condn to check if nums2 is empty and nums1 is sorted
            return;
        }


        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while(p1 >= 0 && p2>=0){
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            if(nums1[p1] > nums2[p2]){
                p1--;
            }
            else{
                p2--;
            }
            p3--;
        }

        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
        for(int num: nums1){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        MergeSortArrayThreePointers obj = new MergeSortArrayThreePointers();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        obj.merge(nums1,m,nums2,n);

    }
}