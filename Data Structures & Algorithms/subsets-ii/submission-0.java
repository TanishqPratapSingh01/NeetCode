class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> l, int nums[], int index){
        ans.add(new ArrayList<>(l));
        for (int i=index; i<nums.length; i++){
            if (i > index && nums[i] == nums[i-1]) continue;
            l.add(nums[i]);
            helper(ans,l,nums,i+1);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        helper(ans,l,nums,0);
        return ans;
    }
}
