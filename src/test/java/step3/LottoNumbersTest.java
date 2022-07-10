package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class LottoNumbersTest {

    @Test
    @DisplayName("매칭되는 숫자 카운팅")
    void countMatch(){
        ArrayList<LottoNumber> lottoNumberList = new ArrayList<>();
        for(int i = 1; i <= 6; i++){
            lottoNumberList.add(new LottoNumber(i));
        }
        LottoNumbers lottoNumbers = new LottoNumbers(lottoNumberList);
        LottoNumbers lottoNumbers1 = new LottoNumbers(lottoNumberList);

        assertThat(lottoNumbers.countMatch(lottoNumbers1)).isEqualTo(6);
    }

}