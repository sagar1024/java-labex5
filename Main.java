public class Main {
    public static void main(String[] args) {
        int[] transactionAmounts = {100, 200, 300, 400, 500};

        Thread[] threads = new Thread[transactionAmounts.length];

        for (int i = 0; i < transactionAmounts.length; i++) {
            FinancialTask financialTask = new FinancialTask(transactionAmounts[i]);
            threads[i] = new Thread(financialTask);
            threads[i].start(); // Start each thread
        }

        // Join threads to wait for their completion
        for (Thread thread : threads) {
            try {
                thread.join(); // Wait for each thread to complete
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while waiting: " + e.getMessage());
            }
        }
    }
}
