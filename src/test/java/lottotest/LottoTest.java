package lottotest;

import lotto.domain.Lotteries;
import lotto.domain.Lotto;
import lotto.domain.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LottoTest {
    private Lotto lotto;

    @BeforeEach
    void setUp() {
        lotto = new Lotto();
    }

    @Test
    void buyLotto() {
        Money money = new Money(14000);
        int expected = 14;

        Lotteries lotteries = lotto.buy(money);
        assertThat(lotteries.count()).isEqualTo(expected);
    }
}
