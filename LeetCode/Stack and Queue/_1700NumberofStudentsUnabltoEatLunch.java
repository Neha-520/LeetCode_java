
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _1700NumberofStudentsUnabltoEatLunch {
    class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            Queue<Integer> q = new LinkedList<>();
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < students.length; i++)
                q.add(students[i]);
            for (int i = sandwiches.length - 1; i >= 0; i--)
                s.push(sandwiches[i]);
            int c = q.size() * s.size();
            while (c-- > 0) {
                if ((!q.isEmpty()) && (q.peek() == s.peek())) {
                    q.poll();
                    s.pop();
                } else {
                    if (q.size() > 0)
                        q.add(q.poll());
                    else
                        return 0;
                }
            }
            return q.size();
        }
    }

}
