class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) return -1;

        Deque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens) {
            if (t.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if (t.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (t.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
            } else if (t.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.valueOf(t));
            }
        }

        return stack.pop();
    }
}
