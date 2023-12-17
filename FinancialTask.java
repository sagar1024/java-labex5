class FinancialTask implements Runnable {
    private int transactionAmount;

    public FinancialTask(int amount) {
        this.transactionAmount = amount;
    }

    public void run() {
        try {
            // Simulating processing a financial transaction
            System.out.println("Processing transaction of amount: $" + transactionAmount);

            // Simulating delay for processing
            Thread.sleep(2000);

            System.out.println("Transaction of amount $" + transactionAmount + " processed successfully.");
        } catch (InterruptedException e) {
            System.out.println("Transaction processing interrupted for amount $" + transactionAmount);
        }
    }
}
