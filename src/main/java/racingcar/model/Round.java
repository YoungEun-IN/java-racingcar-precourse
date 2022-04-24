package racingcar.model;

public class Round {
  public static final String INPUT_ERROR_MSG = "[ERROR] 잘못된 입력값입니다.";
  public static final int MinNumber = 0;
  private final int round;

  public int getRound() {
    return round;
  }

  public Round(String s) {
    try {
      round = Integer.parseInt(s);
    }
    catch (Exception e) {
      throw new IllegalArgumentException(INPUT_ERROR_MSG);
    }
    if (MinNumber >= round) {
      throw new IllegalArgumentException(INPUT_ERROR_MSG);
    }
  }
}
