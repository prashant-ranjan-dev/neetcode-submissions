class Solution {
        public static int evalRPN(String[] tokens) {
        Stack <Integer> s = new Stack <Integer>();

        for(String c : tokens){
            if("+-*/".indexOf(c) != -1){
                int second = s.pop();
                int first = s.pop();
                switch(c){
                    case "+":
                        s.push(first + second);
                        break;
                    case "-":
                        s.push(first - second);
                        break;
                    case "*":
                        s.push(first * second);
                        break;
                    case "/":
                        s.push(first / second);
                        break;
                }
                continue;
            }
            s.push(Integer.parseInt(c));
        }
        return s.pop();
    }
    
}
