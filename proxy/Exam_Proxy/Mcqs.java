package GOF.Lab8.proxy.Exam_Proxy;

public class Mcqs implements Question {

    int count;

    public Mcqs(int count) {
        this.count = count;

    }

    @Override
    public String name() {
        return " MCQs";

    }

    @Override
    public int count() {
        return count;
    }

}
