public class Main {
  public static void main(String[] args) {
    Quiz quiz = new Quiz("Quiz");
    quiz.addQuestion(
            new MultipleChoiceQuestion(
                    new Statement("Pregunta 1"),
                    new CorrectOption(new Statement("opción 1")),
                    new Option(new Statement("opcion 2")),
                    new Option(new Statement("opcion 3"))
            ));
    quiz.addQuestion(
            new TrueFalseQuestion(
                    new Statement("Pregunta 2"),
                    Selection.TRUE
            ));
    Student student = new Student("ESGP");
    student.setQuiz(quiz);
    student.answer(2, 1);
    System.out.println(quiz.printQuiz());
    System.out.println(student.printGrade());
  }
}