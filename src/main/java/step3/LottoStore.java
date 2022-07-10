package step3;

import java.util.ArrayList;
import java.util.List;

public class LottoStore {

    public static final String INVALID_PURCHASE_MONEY_MESSAGE = "로또를 구매하기 위해선 1000원 이상 필요합니다.";
    public static final int LOTTO_PRICE = 1000;

    public static List<LottoNumbers> purchaseLotto(int payed) {
        validatePayPrice(payed);
        List<LottoNumbers> lottoNumbersList = new ArrayList<>();
        for(int i = 0; i < payed / LOTTO_PRICE; i++){
            List<LottoNumber> lottoNumbers = LottoNumberGenerator.generateLottoNumbers();
            lottoNumbersList.add(new LottoNumbers(lottoNumbers));
        }

        return lottoNumbersList;
    }

    private static void validatePayPrice(int payed){
        if(payed < LOTTO_PRICE) {
            throw new IllegalArgumentException(INVALID_PURCHASE_MONEY_MESSAGE);
        }
    }

}
