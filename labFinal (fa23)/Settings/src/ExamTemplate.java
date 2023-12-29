abstract class ExamTemplate {
    public final void takeExam() {
        // Common logic

        if (isOnline()) {
            authenticateStudent();
        }

        conductExam();

        // Additional logic
    }
    protected abstract boolean isOnline();

    protected abstract void authenticateStudent();

    protected abstract void conductExam();
}
