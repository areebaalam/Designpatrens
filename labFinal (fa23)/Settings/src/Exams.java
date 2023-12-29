class Exam {
    // Exam details
}

class ConcreteExamBuilder implements ExamBuilder {
    private Exam exam;

    public ConcreteExamBuilder() {
        this.exam = new Exam();
    }

    @Override
    public void buildMCQs() {
        // Build MCQs logic
    }

    @Override
    public void buildShorts() {
        // Build short answer questions logic
    }

    @Override
    public Exam getExam() {
        return this.exam;
    }
}

// Iterator pattern for stakeholders
interface ExamIterator {
    boolean hasNext();

    Colleague next();
}