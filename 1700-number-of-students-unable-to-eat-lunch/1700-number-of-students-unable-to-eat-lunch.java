import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new ArrayDeque<>();
        Stack<Integer> sandwiche = new Stack<>();
        
        // Initialize queues and stack
        for(int i = 0; i < students.length; i++) {
            student.add(students[i]);            
        }
        
        for(int i = sandwiches.length - 1; i >= 0 ; i--) {
            sandwiche.add(sandwiches[i]);            
        }
        
        // Iterate over student queue until no more changes are made
        boolean changesMade = true;
        while (changesMade && !student.isEmpty() && !sandwiche.isEmpty()) {
            changesMade = false; // Reset the flag
            
            // Iterate over the student queue
            int size = student.size();
            for(int i = 0; i < size; i++) {
                if (student.peek() == sandwiche.peek()) {
                    sandwiche.pop();
                    student.remove();
                    changesMade = true; // Set flag if changes are made
                } else {
                    // If the sandwich doesn't match, move the student to the end of the queue
                    int n = student.remove();
                    student.add(n);
                }
            }
        }
        
        // Return the remaining students in the queue
        return student.size();
    }
}
