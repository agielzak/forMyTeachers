package bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    private BigDecimal accountBalance = new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP);

    public BigDecimal addingToTheAccount(BigDecimal addToAccount) {

        accountBalance = accountBalance.add(addToAccount).setScale(2, RoundingMode.HALF_UP);
        return accountBalance;
    }

    public BigDecimal subtractingFromTheAccount (BigDecimal subToAccount) {

        accountBalance = accountBalance.subtract(subToAccount).setScale(2, RoundingMode.HALF_UP);
        return accountBalance;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }


}