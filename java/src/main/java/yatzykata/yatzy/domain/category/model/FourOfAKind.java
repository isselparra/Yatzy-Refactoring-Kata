package yatzykata.yatzy.domain.category.model;

import yatzykata.yatzy.domain.category.MatchingDiceHelper;
import yatzykata.yatzy.domain.roll.model.Roll;

public record FourOfAKind(Roll roll) implements Category {
  private static final int DIE_MATCH_FOUR_TIMES = 4;

  @Override
  public int calculateScore() {
    return MatchingDiceHelper.getScoreForDiceThatMatchMultipleTimes(
        MatchingDiceHelper.getDiceByAtLeastANumberOfTimesADieIsFound(
            roll.dice(), DIE_MATCH_FOUR_TIMES),
        DIE_MATCH_FOUR_TIMES);
  }
}
