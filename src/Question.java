import java.util.ArrayList;

public abstract class Question {
  private final int score;
  private final Statement statement;
  private final ArrayList<Object> options;

  public Question(Statement statement, ArrayList<Object> options) {
    this.statement = statement;
    this.options = options;
    checkOneCorrectOption(options);
    score = 1;
  }

  public double grade(int answer) {
    return (options.get(answer - 1) instanceof CorrectOption) ? score : 0;
  }

  private void checkOneCorrectOption(ArrayList<Object> options) {
    int correctOptionsCounter = 0;
    for (Object option : options) {
      if (option instanceof CorrectOption) {
        correctOptionsCounter += 1;
      }
    }
    if (correctOptionsCounter != 1) {
      throw new Error();
    }
  }

  public Statement getStatement() {
    return statement;
  }

  public String printOptions() {
    StringBuilder accumulator = new StringBuilder();
    for (Object option : options) {
      accumulator.append(option).append("\n");
    }
    return accumulator.toString();
  }
}
