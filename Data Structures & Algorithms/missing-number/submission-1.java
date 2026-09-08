class Solution {
    public int missingNumber(int[] nums) {
        int miss = nums.length;
        for (int i=0; i<nums.length; i++){
            miss += i - nums[i];
            //miss ^= i ^ nums[i];
        }
        return miss;
    }
}
