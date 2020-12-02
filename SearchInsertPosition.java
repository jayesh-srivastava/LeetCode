class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0])
            return 0;
        else if(target>nums[nums.length-1])
            return nums.length;
        int index=0;
        for(int x=0;x<nums.length;x++)
        {
            if((target-nums[x]==0) || (target-nums[x]<0)) {
                index=x;
                x=nums.length;
            }
        }
        return index;
        
    }
}
