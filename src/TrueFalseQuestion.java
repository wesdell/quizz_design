import java.util.ArrayList;

public class TrueFalseQuestion extends Question {
  public TrueFalseQuestion(Statement statement, Selection selection) {
    super(statement, parseToOptions(selection));
  }

  private static ArrayList<Object> parseToOptions(Selection selection) {
    ArrayList<Object> options = new ArrayList<Object>();
    for (Selection option : selection.getClass().getEnumConstants()) {
      if (option == selection) {
        options.add(new CorrectOption(new Statement(option)));
      } else {
        options.add(new Option(new Statement(option)));
      }
    }
    return options;
  }
}
