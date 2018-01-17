package bank;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    public Account account;

    @Before
    public void setUp() {
        account = new Account();
    }

    @Test
    public void shouldAddingToTheAccount () {
        //given
        BigDecimal howToAdd = new BigDecimal(1.55).setScale(2, RoundingMode.HALF_UP);
        account.setAccountBalance(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP));

        //when
        account.addingToTheAccount(howToAdd);

        //then
        assertThat(account.getAccountBalance()).isEqualTo(new BigDecimal(1.55)
                .setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void shouldSubtractingFromTheAccount() {
        //given
        BigDecimal howToSub = new BigDecimal(2.55).setScale(2, RoundingMode.HALF_UP);
        account.setAccountBalance(new BigDecimal(5.25).setScale(2, RoundingMode.HALF_UP));

        //when
        account.subtractingFromTheAccount(howToSub);

        //then
        assertThat(account.getAccountBalance()).isEqualTo(new BigDecimal(2.70)
                .setScale(2, RoundingMode.HALF_UP));
    }

}