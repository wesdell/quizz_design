public abstract class Question {
  private final int score;
  private final Statement statement;
  private final Option[] options;

  public Question(Statement statement, Option... options) {
    this.statement = statement;
    this.options = options;
    checkOneCorrectOption(options);
    score = 1;
  }

  public double grade(int answer) {
    return (options[answer - 1] instanceof CorrectOption) ? score : 0;
  }

  private void checkOneCorrectOption(Option[] options) {
    int correctOptionsCounter = 0;
    for (Option option : options) {
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
    for (Option option : options) {
      accumulator.append(option.getStatement()).append("\n");
    }
    return accumulator.toString();
  }
}
