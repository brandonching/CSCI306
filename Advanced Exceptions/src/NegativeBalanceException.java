import java.io.*;

public class NegativeBalanceException extends Exception {
    private double negativeBalance;

    public NegativeBalanceException() {
        super("Error: negative balance");
    }

    public NegativeBalanceException(double negativeBalance) {
        super("Amount exceeds balance by " + negativeBalance);
        this.negativeBalance = negativeBalance;
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("logfile.txt", true));
            writer.println("Amount exceeds balance by " + negativeBalance);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "Balance of " + negativeBalance + " not allowed";
    }
}
