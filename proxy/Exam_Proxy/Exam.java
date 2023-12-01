package GOF.Lab8.proxy.Exam_Proxy;

import java.util.HashMap;

public class Exam implements Cloneable {

    HashMap<String, Question> questions = new HashMap<>();

    public void add(String name, Question question) {
        questions.put(name, question);
    }

    void show() {
        for (Question question : questions.values()) {
            System.out.println("Question type: " + question.name() + "------" + " Question Count: " + question.count());
        }
    }

    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

}
