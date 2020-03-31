package lotto.domain;

import java.util.List;

public class Lotteries {
    private List<String> lottoNumbers;

    public Lotteries(final List<String> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public int count() {
        return lottoNumbers.size();
    }

    public List<String> getLottoNumbers() {
        return lottoNumbers;
    }
}
