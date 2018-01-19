package bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bank {
    Currencies ZL = Currencies.ZL;




    public BigDecimal addingToTheAccount(BigDecimal addToAccount, Account account) {

        account.setAccountBalance(account.getAccountBalance().add(addToAccount).setScale(2, RoundingMode.HALF_UP));
        return account.getAccountBalance();
    }

    public BigDecimal subtractingFromTheAccount (BigDecimal subToAccount, Account account) {

       account.setAccountBalance(account.getAccountBalance().subtract(subToAccount).setScale(2, RoundingMode.HALF_UP));
        return account.getAccountBalance();
    }

    public void transferFromFirstAccountToSecondAccount(BigDecimal howToTransfer, Account firstAccount, Account secondAccount) {
        subtractingFromTheAccount(howToTransfer, firstAccount);
        addingToTheAccount(howToTransfer, secondAccount);
    }

}