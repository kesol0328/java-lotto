package lotto.controller;

import lotto.domain.Money;
import lotto.view.InputView;
import lotto.view.ResultView;

public class LottoApp {

    public static void main(String[] args) {
        InputView inputView = new InputView();

        Money inputPrice = inputView.inputMoney();
        System.out.println(inputPrice.getMoney());
        ResultView.printLotteryCount(inputPrice.createLottery(inputPrice.getMoney()));
    }
}
