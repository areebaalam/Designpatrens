package GOF.Lab8.proxy.Exam_Proxy;

public class FillInTheBlanks implements Question {

    public FillInTheBlanks(int count) {
        this.count = count;
    }

    int count;

    @Override
    public String name() {
        return "fill in the blanks";
    }

    @Override
    public int count() {
        return count;
    }

}
