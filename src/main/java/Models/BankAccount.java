package Models;

public class BankAccount {

    private String username;
    private int accountNo;
    private String accountType;
    private double balance;

    public BankAccount(String username, int accountNo, String accountType, double balance) {
        this.username = username;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
    }

        public String getUsername() {
            return username;
        }

        public int getAccountNo() {
            return accountNo;
        }

        public String getAccountType() {
            return accountType;
        }

        public double getBalance() {
            return balance;
        }




}
