package GOF.Lab8.proxy.Exam_Proxy;

public class demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        ExamCache.loadCache();

        ExamProxy examProxy = new ExamProxy();

        Exam exam = examProxy.getExam();
        exam.show();

        Exam exam2 = examProxy.getExam();

        exam2.show();

    }
}
