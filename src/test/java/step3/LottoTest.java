package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    @DisplayName("보너스 번호가 일치하는지 확인")
    void isNotMatchBonus(){
        ArrayList<LottoNumber> lottoNumberList = new ArrayList<>();
        for(int i = 1; i <= 6; i++){
            lottoNumberList.add(new LottoNumber(i));
        }
        LottoNumbers lottoNumbers = new LottoNumbers(lottoNumberList);
        Lotto lotto = new Lotto(lottoNumbers, new LottoNumber(7));
        assertThat(lotto.isMatchBonus()).isEqualTo(false);

        Lotto lotto2 = new Lotto(lottoNumbers, new LottoNumber(6));
        assertThat(lotto2.isMatchBonus()).isEqualTo(true);

    }
}
