public class Option {
  private Statement statement;

  public Option(Statement statement) {
    this.statement = statement;
  }

  public Statement getStatement() {
    return statement;
  }

  @Override
  public String toString() {
    return statement.toString();
  }
}
