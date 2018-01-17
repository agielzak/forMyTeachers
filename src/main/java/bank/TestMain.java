package bank;

import java.math.BigDecimal;

import static java.lang.Thread.sleep;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        for ( int i = 0 ; i <= 10 ; i++ ) {
            System.out.println("Dodaje 1.52...");
            sleep(500);
            account.addingToTheAccount(new BigDecimal(1.52));
            System.out.println("Aktualny stan konta: " + account.getAccountBalance());
            sleep(1500);
        }


    }
}


// dodawanie -- .add(new BigDecimal(5.69)).setScale(2, RoundingMode.HALF_UP)