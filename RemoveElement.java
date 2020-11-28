class Solution {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        int j=0;
        for(int x=0;x<length;x++)
            if(nums[x]!=val) {
                nums[j]=nums[x];
                j++;
            }
        return j;
    }
}
