package GOF.Lab8.proxy.Exam_Proxy;

import java.util.HashMap;

public class ExamCache {

    private static HashMap<String, Exam> examCache = new HashMap<>();

    public static void loadCache() {
        ExamBuilder builder = new ExamBuilder();
        
        examCache.put("1", builder.buildExam());
    }

    public static Exam getExam(String id) throws CloneNotSupportedException {
        return (Exam) examCache.get(id).clone();

    }

}
