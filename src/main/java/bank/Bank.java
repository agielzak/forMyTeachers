package bank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Currencies, BigDecimal> exchangeRates = new HashMap<>();

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

    public void setExchangeRates(){
        exchangeRates.put(Currencies.CHF, new BigDecimal(3.54).setScale(2, RoundingMode.HALF_UP));
        exchangeRates.put(Currencies.USD, new BigDecimal(3.41).setScale(2, RoundingMode.HALF_UP));
        exchangeRates.put(Currencies.EUR, new BigDecimal(4.17).setScale(2, RoundingMode.HALF_UP));
    }
}