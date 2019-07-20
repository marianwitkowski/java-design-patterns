package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(123456L,
        "Jan Kowalski", "Warszawa", 100, 0.5 );


        BetterBankAccount account = new BetterBankAccount.Builder(123456789L)
                .withOwner("Jan Kowalski")
                .atRate(3.3)
                .atBranch("Warszawa")
                //.withPhoneNumber("601602603")
                //.isPremium()
                //.openingBalance(987.65f)
                .build();

        String s = new StringBuilder().
                append("Hello").append(" ").append("world!").toString();
        System.out.println(s);

        if (s!=null) {

        }
        if (null!=s) {

        }

    }
}
