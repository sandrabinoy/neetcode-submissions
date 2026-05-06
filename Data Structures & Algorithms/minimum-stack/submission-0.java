class MinStack {

    private ArrayDeque<Integer> stack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        stack.push(val);
    }
    
    public void pop() {
        int el = stack.pop();
        if (el == min) {
            min = Integer.MAX_VALUE;
            findNewMin();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }

    private void findNewMin() {
        for (int el : stack) {
            min = Math.min(min, el);
        }
    }
}
