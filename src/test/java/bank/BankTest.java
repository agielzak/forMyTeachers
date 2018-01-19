package bank;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

public class BankTest {

    public Account firstAccount, secondAccount;
    public Bank bank;

    @Before
    public void setUp() {
        firstAccount = new Account();
        secondAccount = new Account();
        bank = new Bank();
    }


    @Test
    public void shouldAddingToTheAccount() {
        //given
        BigDecimal howToAdd = new BigDecimal(1.55).setScale(2, RoundingMode.HALF_UP);
        firstAccount.setAccountBalance(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP));

        //when
        bank.addingToTheAccount(howToAdd, firstAccount);

        //then
        assertThat(firstAccount.getAccountBalance()).isEqualTo(new BigDecimal(1.55)
                .setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void shouldSubtractingFromTheAccount() {
        //given
        BigDecimal howToSub = new BigDecimal(2.55).setScale(2, RoundingMode.HALF_UP);
        firstAccount.setAccountBalance(new BigDecimal(5.25).setScale(2, RoundingMode.HALF_UP));

        //when
        bank.subtractingFromTheAccount(howToSub, firstAccount);

        //then
        assertThat(firstAccount.getAccountBalance()).isEqualTo(new BigDecimal(2.70)
                .setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void shouldTransferFromFirstAccountToSecondAccount() {
        //given
        BigDecimal howToTransfer = new BigDecimal(6.20).setScale(2, RoundingMode.HALF_UP);
        firstAccount.setAccountBalance(new BigDecimal(100.00).setScale(2, RoundingMode.HALF_UP));
        secondAccount.setAccountBalance(new BigDecimal(50.00).setScale(2, RoundingMode.HALF_UP));

        //when
        bank.transferFromFirstAccountToSecondAccount(howToTransfer, firstAccount, secondAccount);

        //then
        assertThat(firstAccount.getAccountBalance()).isEqualTo(new BigDecimal(93.80)
                    .setScale(2, RoundingMode.HALF_UP));
        assertThat(secondAccount.getAccountBalance()).isEqualTo(new BigDecimal(56.20)
                    .setScale(2, RoundingMode.HALF_UP));
    }

}