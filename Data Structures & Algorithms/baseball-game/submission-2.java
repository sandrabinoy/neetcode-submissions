class Solution {
    public int calPoints(String[] operations) {
        if (operations == null || operations.length == 0) return -1;

        Deque<Integer> stack = new ArrayDeque<>();
        int totalScore = 0;
        for (String op : operations) {
            if (op.equals("+")) {
                int a = stack.pop();
                int score = a + stack.peek();
                stack.push(a);
                stack.push(score);
                totalScore += score;
            } else if (op.equals("D")) {
                int score = stack.peek() * 2;
                stack.push(score);
                totalScore += score;
            } else if (op.equals("C")) {
                int score = stack.pop();
                totalScore -= score;
            } else {
                int val = Integer.valueOf(op);
                stack.push(val);
                totalScore += val;
            }
        }
        return totalScore;
    }
}