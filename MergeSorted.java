// time complexity:O(m+n)
//space complexity:O(1)
public class MergeSorted {
        public void merge(int[] nums1, int m, int[] nums2, int n)
        {
            if(nums1.length==0 || nums1==null)
            {
                return;
            }
            int p1=m-1;
            int p2=n-1;
            int p3=m+n-1;
            while(p1>=0 && p2>=0)
            {
                nums1[p3]=Math.max(nums1[p1],nums2[p2]);
                p3--;
                if(nums1[p1]>nums2[p2])
                {
                    p1--;
                }
                else
                {
                    p2--;
                }
            }
            while(p2>=0)
            {
                nums1[p3]=nums2[p2];
                p3--;
                p2--;
            }
        }
        public static void main(String[] args)
        {
            MergeSorted ms= new MergeSorted();
            int[] nums1 = {1,2,3,0,0,0};
            int m = 3;
            int[]nums2 = {2,5,6};
            int n = 3;
            ms.merge(nums1,m,nums2,n);
            for(int i=0;i<nums1.length;i++)
            {
                System.out.print(nums1[i]+ " ");
            }
        }
    }

