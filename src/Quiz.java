public class Quiz {
  private final String name;
  private final Question[] questions;
  private int questionCounter;

  public Quiz(String name) {
    this.name = name;
    questions = new Question[2];
  }

  public void addQuestion(Question question) {
    questions[questionCounter++] = question;
  }

  public double getGrade(int[] answers) {
    double grade = 0.0;
    int i = 0;
    for (Question question : questions) {
      grade += question.garde(answers[i++]);
    }
    return grade;
  }

  public int getQuizPoints() {
    return questions.length;
  }

  @Override
  public String toString() {
    return name;
  }
}
