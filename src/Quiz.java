public class Quiz {
  private final String name;
  private final Question[] questions;
  private int questionCounter;

  public Quiz(String name) {
    this.name = name;
    questions = new Question[2];
  }

  public void addQuestion(Question question) {
    if (questionCounter >= questions.length) {
      throw new Error();
    }
    questions[questionCounter++] = question;
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
    return questions.length;
  }

  public int getQuestionCounter() {
    return questionCounter;
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
