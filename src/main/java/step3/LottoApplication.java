package step3;

import java.util.List;

public class LottoApplication {

    public static void main(String[] args) {
        int payedPrice = InputView.inputPrice();
        List<LottoNumbers> lottoNumbersList = LottoStore.purchaseLotto(payedPrice);
        ResultView.showLottoNumbers(lottoNumbersList);
        LottoNumbers winningLottoNumber = InputView.inputWinningLottoNumber();
        LottoNumber bonusLottoNumber = InputView.inputBonusLottoNumber();
        Lotto winningLotto = new Lotto(winningLottoNumber, bonusLottoNumber);
        ResultView.printResult(lottoNumbersList, winningLotto, payedPrice);
    }

}
