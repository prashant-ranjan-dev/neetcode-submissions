
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        
        Deque<Character> st = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            
            if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) return false; 
                char ch = st.pop();
                
                switch (c) {
                    case ')' -> { if (ch != '(') return false; }
                    case '}' -> { if (ch != '{') return false; }
                    case ']' -> { if (ch != '[') return false; }
                }
            } else {
                st.push(c);
            }
        }
        
        return st.isEmpty();
    }
}