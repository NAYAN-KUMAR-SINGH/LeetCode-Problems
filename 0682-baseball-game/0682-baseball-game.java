

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("+") && !s.isEmpty()) {
                int top = s.pop();
                int sum = top + s.peek();
                s.push(top);
                s.push(sum);
            } else if (op.equals("C") && !s.isEmpty()) {
                s.pop();
            } else if (op.equals("D") && !s.isEmpty()) {
                int doubleValue = 2 * s.peek();
                s.push(doubleValue);
            } else {
                int score = Integer.parseInt(op);
                s.push(score);
            }
        }
        
        int totalPoints = 0;
        while (!s.isEmpty()) {
            totalPoints += s.pop();
        }
        
        return totalPoints;
    }
}
