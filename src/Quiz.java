import java.util.ArrayList;

public class Quiz {
  private final String name;
  private final ArrayList<Question> questions = new ArrayList<Question>();

  public Quiz(String name) {
    this.name = name;
  }

  public void addQuestion(Question question) {
    questions.add(question);
  }

  public double getGrade(int[] answers) {
    double grade = 0.0;
    int i = 0;
    for (Question question : questions) {
      grade += question.grade(answers[i++]);
    }
    return grade;
  }

  public double getQuizPoints() {
    return questions.size();
  }

  public int getNumberQuestion() {
    return questions.size();
  }

  public String printQuiz() {
    StringBuilder accumulator = new StringBuilder();
    for (Question question : questions) {
      accumulator.append(question.getStatement()).append("\n");
      accumulator.append(question.printOptions());
    }
    return accumulator.toString();
  }

  @Override
  public String toString() {
    return name;
  }
}
