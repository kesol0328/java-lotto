package lottotest;

import lotto.domain.Money;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {
    @Test
    void divideMoneyTest() {
        Money money = new Money(14000);
        assertThat(money.createLottery(14000)).isEqualTo(14);
    }

    @Test
    void isNegative() {

    }
}
