import java.io.*;
import java.util.Scanner;

class qn5 {
    public static void main(String args[]) {
        String line = null;
        int totalTransactions = 0;
        float totalbill = 0;
        float max = 0;
        float min = 9999;
        try {
            BufferedReader buf = new BufferedReader(new FileReader("tas.csv"));
            while ((line = buf.readLine()) != null) {
                String[] transactions = line.split(",");
                totalbill += Float.parseFloat(transactions[3]);
                totalTransactions++;
                if (Float.parseFloat(transactions[3]) > max) {
                    max = Float.parseFloat(transactions[3]);
                }
                if (Float.parseFloat(transactions[3]) < min) {
                    min = Float.parseFloat(transactions[3]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n");
        System.out.println("1.Total number of Transactions");
        System.out.println("2.Total bill amount");
        System.out.println("3.Maximum bill amount");
        System.out.println("4.Minimum bill amount");
        int n = sc.nextInt();
        sc.close();
        if (n == 1) {
            System.out.println("Total no.of transactions: " + totalTransactions);
        }
        if (n == 2) {
            System.out.println("Total Bill Amount: " + totalbill);
        }
        if (n == 3)
            System.out.println("Maximum Bill Amount: " + max);
        if (n == 4)
            System.out.println("Minimum Bill Amount: " + min);
    }
}