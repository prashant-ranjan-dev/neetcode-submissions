class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<Character>();
        boolean answer = false;
        for(char c : s.toCharArray()){
            if("({[".indexOf(c) != -1){
                st.push(c);
            } else{
                if(st.size() < 1) return false;
                char ch = st.pop();
                switch(c){
                    case ')':
                        answer = (ch == '(');

                        break;
                    case '}':
                        answer = (ch == '{');
                        break;
                    case ']':
                        answer = (ch == '[');
                        break;
                }
                if(answer == false)
                    return answer;
            }
        }
        if(!st.empty()){
            return false;
        }
        return answer;
    }
}
