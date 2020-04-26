class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<Integer>();
        double f;
        for(int i=0;i<nums1.length;i++) 
            list.add(nums1[i]);
        for(int j=0;j<nums2.length;j++)
               list.add(nums2[j]);
        Collections.sort(list);
        int k=list.size();
        if(k%2==0)
           f=(double)((list.get(k/2-1))+(list.get(k/2)))/2;
        else 
            f = list.get(((k + 1) / 2)-1);
        return f;
    }
}
