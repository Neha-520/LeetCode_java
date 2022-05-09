public class _1116PrintZeroEvenOdd {
    class ZeroEvenOdd {
        private int n;
        private Semaphore zeroSem;
        private Semaphore evenSem;
        private Semaphore oddSem;

        private boolean isOdd = true;

        public ZeroEvenOdd(int n) {
            this.n = n;
            zeroSem = new Semaphore(1);
            evenSem = new Semaphore(0);
            oddSem = new Semaphore(0);
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                zeroSem.acquire();
                printNumber.accept(0);
                if (isOdd)
                    oddSem.release();
                else
                    evenSem.release();
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i += 2) {
                evenSem.acquire();
                printNumber.accept(i);
                isOdd = true;
                zeroSem.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i += 2) {
                oddSem.acquire();
                printNumber.accept(i);
                isOdd = false;
                zeroSem.release();
            }
        }
    }
}
