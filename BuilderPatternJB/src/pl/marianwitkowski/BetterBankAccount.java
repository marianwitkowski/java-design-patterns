package pl.marianwitkowski;

public class BetterBankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;
    private boolean premium = false;
    private String phoneNumber;

    public static class Builder {

        private long accountNumber;
        private String owner;
        private String branch;
        private boolean premium;
        private double balance;
        private double interestRate;
        private String phoneNumber;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder isPremium() {
            this.premium = true;
            return this;
        }

        public BetterBankAccount build() {
            BetterBankAccount account = new BetterBankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            account.premium = this.premium;
            account.phoneNumber = this.phoneNumber;
            return account;
        }
    }

    private BetterBankAccount() {
    }

}
