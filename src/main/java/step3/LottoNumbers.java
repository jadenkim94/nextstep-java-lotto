package step3;

import java.util.List;
import java.util.stream.Collectors;

public class LottoNumbers {

    public static final int LOTTO_SIZE = 6;
    public static final String INVALID_LOTTO_SIZE_MESSAGE = "로또 번호 갯수는 6개 이어야 합니다.";
    private List<LottoNumber> lottoNumbers;

    public LottoNumbers(List<LottoNumber> lottoNumbers) {
        validateLottoSize(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    private void validateLottoSize(List<LottoNumber> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException(INVALID_LOTTO_SIZE_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "LottoNumbers{" +
            "lottoNumbers=" + lottoNumbers +
            '}';
    }

    public List<Integer> getNumbers() {
        return lottoNumbers
            .stream()
            .map(it -> it.number())
            .collect(Collectors.toList());
    }

    public int countMatch(LottoNumbers winningLottoNumbers) {
        return (int)this.getNumbers().stream()
            .filter(winningLottoNumbers.getNumbers()::contains)
            .count();
    }
}
