public class TrueFalseQuestion {
  public TrueFalseQuestion(String statement, Selection selection) {
    super(statement, parseToOptions(selection));
  }

  public static Options[] parseToOptions(Selection selection) {
    Option[] options = new Option[selection.getClass().getEnumConstants().length];
    int i = 0;
    for (Selection option : selection.getClass().getEnumConstants()) {
      if (option == selection) {
        options[i++] = new CorrectOption(selection);
      } else {
        options[i++] = new Option(selection);
      }
    }
    return options;
  }
}
