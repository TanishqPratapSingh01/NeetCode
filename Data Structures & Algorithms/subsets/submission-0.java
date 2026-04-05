class Solution {
    public void subset(List<List<Integer>> ans, List<Integer> l, int nums[], int index){
        ans.add(new ArrayList<>(l));
        for (int i = index; i < nums.length; i++){
            l.add(nums[i]);
            subset(ans,l,nums,i+1);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        subset(ans,l,nums,0);
        return ans;
    }
}
