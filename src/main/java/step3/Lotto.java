package step3;

import java.util.Objects;

public class Lotto {

    private LottoNumbers lottoNumbers;
    private LottoNumber bonusNumber;

    public Lotto(LottoNumbers lottoNumbers, LottoNumber bonusNumber) {
        this.lottoNumbers = lottoNumbers;
        this.bonusNumber = bonusNumber;
    }

    public Rank match(LottoNumbers winningLottoNumbers) {
        return Rank.of(lottoNumbers.countMatch(winningLottoNumbers), isMatchBonus());
    }

    public boolean isMatchBonus(){
        return lottoNumbers.getNumbers()
            .stream()
            .anyMatch(it -> it == bonusNumber.number());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lotto lotto1 = (Lotto) o;
        return Objects.equals(lottoNumbers, lotto1.lottoNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoNumbers);
    }
}
