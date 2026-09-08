class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i=0; i<nums.length; i++){
            if (i <= farthest){
                farthest = Math.max(farthest,nums[i] + i);
            }else{
                return false;
            }
        }
        return true;
    }
}
