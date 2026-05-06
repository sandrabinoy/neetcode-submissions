class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    switch (c){
                        case ')':
                            if (stack.pop() == '(') {
                                break;
                            }
                            return false;
                            
                        case ']':
                            if (stack.pop() == '[') {
                                break;
                            }
                            return false;
                            
                        case '}':
                            if (stack.pop() == '{') {
                                break;
                            }
                            return false;
                    }
                }
            }
            return stack.isEmpty();
    }
}
