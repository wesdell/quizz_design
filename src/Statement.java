public class Statement {
  private final String content;

  public Statement(String content) {
    this.content = content;
  }

  public Statement(Selection selection) {
    this.content = selection.toString();
  }

  @Override
  public String toString() {
    return content;
  }
}
