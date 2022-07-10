package step3;

import java.util.function.Predicate;

public class LottoNumber {
    public static final int LOTTO_MAX_NUMBER = 45;
    public static final int LOTTO_MIN_NUMBER = 1;
    public static final String INVALID_LOTTO_MIN_NUMBER_MESSAGE = "로또 번호는 1 보다 커야 합니다.";
    public static final String INVALID_LOTTO_MAX_NUMBER_MESSAGE = "로또 번호는 45 보다 작아야 합니다.";
    private int number;

    public LottoNumber(int number) {
        validateLottoNumber(number);
        this.number = number;
    }

    private void validateLottoNumber(int number){
        if (number < LOTTO_MIN_NUMBER) {
            throw new IllegalArgumentException(INVALID_LOTTO_MIN_NUMBER_MESSAGE);
        }

        if (number > LOTTO_MAX_NUMBER) {
            throw new IllegalArgumentException(INVALID_LOTTO_MAX_NUMBER_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public int number() {
        return number;
    }
}
