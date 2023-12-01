package GOF.Lab8.proxy.Exam_Proxy;

public class ExamBuilder {

    public Exam buildExam() {

        Exam exam = new Exam();
        exam.add("mcqs", new Mcqs(10));
        exam.add("blanks", new FillInTheBlanks(5));
        exam.add("descriptive", new Descriptive(6));
        return exam;

    }
}
