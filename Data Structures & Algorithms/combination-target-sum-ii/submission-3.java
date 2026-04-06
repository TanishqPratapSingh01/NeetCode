class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> l,int index, int target, int arr[]){
        if (target == 0 ){
            ans.add(new ArrayList<>(l));
            return;
        }
        for (int i = index; i < arr.length; i++){
            if (i > index && arr[i]== arr[i-1]) continue;
            if (arr[i] > target) break;
            l.add(arr[i]);
            helper(ans,l,i+1,target-arr[i],arr);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans,l,0,target,candidates);
        return ans;
    }
}
