class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 1. If it's an opening bracket, push to stack
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } 
            // 2. If it's a closing bracket
            else {
                // If stack is empty, there's no opening bracket to match
                if (st.isEmpty()) return false;
                
                char top = st.pop();
                
                // Check for mismatch
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        
        // 3. If the stack is empty, all brackets were matched perfectly
        return st.isEmpty();
    }
}