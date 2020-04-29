class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int arr[]=new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
            arr[0]=i;
            arr[1]=map.get(complement);
        }
    }
    return new int[] {arr[1],arr[0]};
} 
}
