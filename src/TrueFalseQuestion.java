public class TrueFalseQuestion extends Question {
  public TrueFalseQuestion(Statement statement, Selection selection) {
    super(statement, parseToOptions(selection));
  }

  public static Option[] parseToOptions(Selection selection) {
    Option[] options = new Option[selection.getClass().getEnumConstants().length];
    int i = 0;
    for (Selection option : selection.getClass().getEnumConstants()) {
      if (option == selection) {
        options[i++] = new CorrectOption(new Statement(option));
      } else {
        options[i++] = new Option(new Statement(option));
      }
    }
    return options;
  }
}
