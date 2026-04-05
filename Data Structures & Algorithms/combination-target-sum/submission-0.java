class Solution {
    public void combination(List<List<Integer>> ans, List<Integer> l, int i, int sum, int nums[], int target){
        if (sum == target) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if (sum > target || i >= nums.length) return;
        combination(ans,l,i+1,sum,nums,target);
        if (sum + nums[i] <= target){
            l.add(nums[i]);
            combination(ans,l,i,sum+nums[i],nums,target);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        combination(ans,l,0,0,nums,target);
        return ans;
    }
}
