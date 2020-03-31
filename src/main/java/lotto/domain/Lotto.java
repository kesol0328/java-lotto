package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public Lotteries buy(Money money) {
        return new Lotteries(createLottery(money));
    }

    private List<String> createLottery(Money money) {
        List<String> lotteries = new ArrayList<>();
        for (int i = 0; i < money.createLottery(money.getMoney()); i++) {
            lotteries.add("addTest");
        }
        return lotteries;
    }

}
