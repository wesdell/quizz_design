public class Student {
  private final String name;
  private Quiz quiz;
  private double grade;

  public Student(String name) {
    this.name = name;
  }

  public void setQuiz(Quiz quiz) {
    this.quiz = quiz;
  }

  public void answer(int... answers) {
    if (answers.length > quiz.getNumberQuestion()) {
      throw new Error();
    }
    grade = quiz.getGrade(answers);
  }

  public String printGrade() {
    return name + " obtuvo la calificacion de " + grade + "/" + quiz.getQuizPoints() + " en " + quiz;
  }
}
