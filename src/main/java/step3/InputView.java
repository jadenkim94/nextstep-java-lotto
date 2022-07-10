package step3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    public static final String INSULT_PURCHASE_MONEY_MESSAGE = "구입금액을 입력해 주세요";
    public static final String INSULT_LAST_WEEK_WINNING_LOTTO_NUMBERS_MESSAGE = "지난 주 당첨 번호를 입력해 주세요";
    private static Scanner sc = new Scanner(System.in);

    public static int inputPrice() {
        System.out.println(INSULT_PURCHASE_MONEY_MESSAGE);
        return Integer.parseInt(sc.nextLine());
    }

    /*public static Lotto inputWinningLottoNumber() {
        System.out.println(INSULT_LAST_WEEK_WINNING_LOTTO_NUMBERS_MESSAGE);
        String inputString = sc.nextLine().replaceAll(" ", "");
        String[] numbers = inputString.split(",");

        return new Lotto(Arrays.stream(numbers)
            .map(Integer::parseInt)
            .collect(Collectors.toList()), 10);
    }*/
    public static LottoNumbers inputWinningLottoNumber() {
        System.out.println(INSULT_LAST_WEEK_WINNING_LOTTO_NUMBERS_MESSAGE);
        String inputString = sc.nextLine().replaceAll(" ", "");
        String[] numbers = inputString.split(",");
        ArrayList<LottoNumber> lottoNumbers = new ArrayList<>();
        for(String number : numbers){
            lottoNumbers.add(new LottoNumber(Integer.parseInt(number)));
        }
        return new LottoNumbers(lottoNumbers);
    }

    public static LottoNumber inputBonusLottoNumber(){
        System.out.println("보너스 볼을 입력해 주세요.");
        return new LottoNumber(Integer.parseInt(sc.nextLine()));
    }
}
