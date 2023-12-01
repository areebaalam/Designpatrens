package GOF.Lab8.proxy.Exam_Proxy;

public class ExamProxy {

    Exam exam;
    public Exam getExam() throws CloneNotSupportedException {
        if(exam==null){
            exam=ExamCache.getExam("1");
        }
        return exam;    
    }

}
