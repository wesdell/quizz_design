public abstract class Question {
  private final int score;
  private final Statement statement;
  private final Option[] options;

  public Question(Statement statement, Option... options) {
    this.statement = statement;
    this.options = options;
    score = 1;
  }

  public double grade(int answer) {
    return (options[answer - 1] instanceof CorrectOption) ? score : 0;
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
