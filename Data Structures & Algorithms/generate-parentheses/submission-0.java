class Solution {
    public void helper(List<String> ans, String s, int n, int open, int close){
        
        if (s.length() == 2*n){
            ans.add(s);
            return;
        }
        if (open < n){
            helper(ans,s+'(',n,open+1,close);
        }
        if (close < open){
            helper(ans,s+')',n,open,close+1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"",n,0,0);
        return ans;
    }
}
