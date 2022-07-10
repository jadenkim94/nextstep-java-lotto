package step3;

import java.util.Arrays;

public enum Rank {
    FIRST(6, 2000000000),
    SECOND(5, 30000000),
    THIRD(5, 1500000),
    FORTH(4, 50000),
    FIFTH(3, 5000),
    FAIL(0, 0);

    private final int matchNumberCount;
    private final int reward;

    Rank(int matchNumberCount, int reward) {
        this.matchNumberCount = matchNumberCount;
        this.reward = reward;
    }

    public static Rank of(int matchNumberCount) {
        return Arrays.stream(Rank.values())
            .filter(i -> i.matchNumberCount == matchNumberCount)
            .findFirst()
            .orElse(FAIL);
    }

    public static Rank of(int matchNumberCount, boolean isMatchBonus) {
        Rank rank = Rank.of(matchNumberCount);

        if( rank == Rank.SECOND && !isMatchBonus){
            return Rank.THIRD;
        }
        return rank;
    }

    public int getMatchNumberCount() {
        return matchNumberCount;
    }

    public int getReward() {
        return reward;
    }
}
