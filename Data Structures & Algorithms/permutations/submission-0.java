class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> l, int nums[], boolean vis[]){
        if (l.size() == nums.length) {
            ans.add(new ArrayList<>(l));
            return;
        }

        for (int i = 0; i<nums.length; i++){
            if (vis[i]) continue;
            vis[i] = true;
            l.add(nums[i]);
            helper(ans,l,nums,vis);
            l.remove(l.size()-1);
            vis[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        helper(ans,l,nums,vis);
        return ans;
    }
}
