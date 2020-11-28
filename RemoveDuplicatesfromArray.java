class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length==0 || length ==1)
            return length;
        
        int j=0;
        for(int x=0;x<length-1;x++)
        {
            if(nums[x]!=nums[x+1])
            {
                nums[j]=nums[x];
                j++;
            }
        }
        nums[j]=nums[length-1];
        j++;
        return j;
    }
    
}
