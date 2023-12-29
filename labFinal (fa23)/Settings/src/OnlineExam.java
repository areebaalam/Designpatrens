class OnlineExam extends ExamTemplate {
    private boolean online;

    public OnlineExam(boolean online) {
        this.online = online;
    }

    @Override
    protected boolean isOnline() {
        return online;
    }

    @Override
    protected void authenticateStudent() {
        System.out.println("Authenticating student online");
    }

    @Override
    protected void conductExam() {
        System.out.println("Conducting online exam");
    }
}

// Observer pattern for real-time communication
interface Observer {
    void update(String message);
}