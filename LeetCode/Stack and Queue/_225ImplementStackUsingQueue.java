public class _225ImplementStackUsingQueue {
    class MyStack {
        Queue<Integer> mainQueue, helperQueue;

        public MyStack() {
            mainQueue = new LinkedList<>();
            helperQueue = new LinkedList<>();
        }

        public void push(int x) {
            mainQueue.add(x);
        }

        public int pop() {
            if (mainQueue.size() == 0) {
                return -1;
            } else {
                while (mainQueue.size() != 1) {
                    helperQueue.add(mainQueue.remove());
                }
                int remove = mainQueue.remove();
                while (helperQueue.size() > 0) {
                    mainQueue.add(helperQueue.remove());
                }
                return remove;
            }
        }

        public int top() {
            if (mainQueue.size() == 0)
                return -1;
            else {
                while (mainQueue.size() != 1) {
                    helperQueue.add(mainQueue.remove());
                }
                int top = mainQueue.remove();
                while (helperQueue.size() > 0) {
                    mainQueue.add(helperQueue.remove());
                }
                mainQueue.add(top);
                return top;
            }
        }

        public boolean empty() {
            return mainQueue.isEmpty();
        }
    }

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}
