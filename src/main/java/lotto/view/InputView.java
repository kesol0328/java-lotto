package lotto.view;

import lotto.domain.Money;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static final int PER_LOTTO = 1000;
    private static Scanner scanner = new Scanner(System.in);
    private static int lotteries;

    public Money inputMoney() {
        return new Money(lotteries());
    }

    public static int lotteries() {
        System.out.println("구입금액을 입력해 주세요.");
        return inputMoneyValidator();
    }

    private static int inputMoneyValidator() {
        try {
            lotteries = isGreaterThanPerLotto(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력가능합니다.");
            lotteries();
        }
        return lotteries;
    }

    private static int isGreaterThanPerLotto(int money) {
        if (money < PER_LOTTO) {
            System.out.println("해당 금액으로 로또를 구입할 수 없습니다.");
            lotteries();
        }
        return money;
    }

}
