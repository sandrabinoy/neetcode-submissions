class Solution {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length];
        int top = -1;
        int totalScore = 0;

        for (String op : operations) {
            char c = op.charAt(0);
            
            switch (c) {
                case '+':
                    int scorePlus = stack[top] + stack[top - 1];
                    stack[++top] = scorePlus;
                    totalScore += scorePlus;
                    break;
                    
                case 'D':
                    int scoreD = stack[top] * 2;
                    stack[++top] = scoreD;
                    totalScore += scoreD;
                    break;
                    
                case 'C':
                    totalScore -= stack[top--];
                    break;
                    
                default:
                    int val = Integer.parseInt(op);
                    stack[++top] = val;
                    totalScore += val;
                    break;
            }
        }
        return totalScore;
    }
}