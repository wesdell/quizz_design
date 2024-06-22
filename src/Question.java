public abstract class Question {
  private final int score;
  private final String statement;
  private final Option[] options;

  public Question(String statement, Option... options) {
    this.statement = statement;
    this.options = options;
    score = 1;
  }

  public double grade(int answer) {
    return (options[answer - 1] instanceof CorrectOption) ? score : 0;
  }
}
