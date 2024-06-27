import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
  public MultipleChoiceQuestion(Statement statement, Option ...options) {
    super(statement, parseToArrayList(options));
  }

  private static ArrayList<Object> parseToArrayList(Option[] options) {
    ArrayList<Object> arrayListOptions = new ArrayList<Object>();
    for (Option option : options) {
      arrayListOptions.add(option);
    }
    return arrayListOptions;
  }
}
