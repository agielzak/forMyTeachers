package bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    private BigDecimal accountBalance = new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP);

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

}