public class Main {
  public static void main(String[] args) {
    Quiz quiz = new Quiz("Quiz");
    quiz.addQuestion(
            new MultipleChoiceQuestion(
                    "Pregunta 1",
                    new CorrectOption("opción 1"),
                    new Option("opción 2"),
                    new Option("opción 3"),
                    new Option("opción 4")
            ));
    quiz.addQuestion(
            new TrueFalseQuestion(
                    "Pregunta 2",
                    Selection.TRUE
            ));

    Student student = new Student("ESGP");
    student.setQuiz(quiz);
    student.answer(2, 1);
    System.out.println(student.printGrade());
  }
}