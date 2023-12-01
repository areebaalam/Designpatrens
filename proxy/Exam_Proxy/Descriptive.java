package GOF.Lab8.proxy.Exam_Proxy;

public class Descriptive implements Question {

    int count;

    public Descriptive(int count) {
        this.count = count;
    }

    @Override
    public String name() {
        return "Descriptive Question";
    }

    @Override
    public int count() {
        return count;
    }

}
