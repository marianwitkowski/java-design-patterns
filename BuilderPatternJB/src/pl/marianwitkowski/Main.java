package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(123456L,
        "Jan Kowalski", "Warszawa", 99.99, 4.5 );


        BetterBankAccount account = new BetterBankAccount.Builder(123456789L)
                .withOwner("Jan Kowalski")
                .atRate(3.3)
                .atBranch("Warszawa")
                .withPhoneNumber("601602603")
                .isPremium()
                .openingBalance(987.65f).build();

    }
}
