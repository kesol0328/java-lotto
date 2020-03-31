package lotto.domain;

import java.util.Objects;

public class Money {
    private static final int PER_LOTTO = 1000;
    private int money;

    public Money(int money) {
        this.money = money;
    }

    public int createLottery(int money) {
        return money / PER_LOTTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return money == money1.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }
}
