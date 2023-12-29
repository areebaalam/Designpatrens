import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;
import java.util.ArrayList;
import java.util.List;

// Singleton for settings
class Settings {
    private static Settings instance;

    private Settings() {
        // Private constructor to prevent instantiation
    }

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    // Add settings methods here
}

// Mediator to control coupling
interface Mediator {
    void sendMessage(String message, Colleague colleague);

    public void addColleague(Teacher aThis);
}

class ExamMediator implements Mediator {
    private List<Colleague> colleagues;

    public ExamMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            if (colleague != originator) {
                colleague.receiveMessage(message);
            }
        }
    }

    @Override
    public void addColleague(Teacher aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

// Colleague interface for stakeholders
interface Colleague {
    void sendMessage(String message);

    void receiveMessage(String message);
}

// Concrete colleague - Teacher
class Teacher implements Colleague {
    private Mediator mediator;
    private String name;

    public Teacher(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addColleague(this);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Teacher " + name + " received message: " + message);
    }

    // Additional methods for managing exams
}

// Concrete colleague - Admin
class Admin implements Colleague {
    private Mediator mediator;
    private String name;

    public Admin(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addColleague(this);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Admin " + name + " received message: " + message);
    }

    // Additional methods for setting schedule and conduction details
}

// Strategy pattern for different exam conduction
interface ExamConductionStrategy {
    void conductExam();
}

// Concrete strategy - In-person exam conduction
class InPersonConduction implements ExamConductionStrategy {
    @Override
    public void conductExam() {
        System.out.println("Conducting in-person exam");
    }
}

// Concrete strategy - Online exam conduction
class OnlineConduction implements ExamConductionStrategy {
    @Override
    public void conductExam() {
        System.out.println("Conducting online exam");
    }
}

// Builder pattern for creating different types of exams
interface ExamBuilder {
    void buildMCQs();

    void buildShorts();

    // Add other types of questions

    Exam getExam();
}

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

class ExamStakeholdersIterator implements ExamIterator {
    private List<Colleague> stakeholders;
    private int position;

    public ExamStakeholdersIterator(List<Colleague> stakeholders) {
        this.stakeholders = stakeholders;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < stakeholders.size();
    }

    @Override
    public Colleague next() {
        if (hasNext()) {
            return stakeholders.get(position++);
        }
        return null;
    }
}

// Template method for taking exam
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

// Concrete template - Online exam
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

class Parent implements Observer {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Parent " + name + " received update: " + message);
    }
}

class RealTimeCommunication {
    private List<Observer> observers;

    public RealTimeCommunication() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Mediator examMediator = new ExamMediator();

        Colleague teacher = new Teacher(examMediator, "John");
        Colleague admin = new Admin(examMediator, "Admin1");

        // Strategy pattern usage
        ExamConductionStrategy inPersonConduction = new InPersonConduction();
        ExamConductionStrategy onlineConduction = new OnlineConduction();

        // Builder pattern usage
        ExamBuilder examBuilder = new ConcreteExamBuilder();
        examBuilder.buildMCQs();
        examBuilder.buildShorts();
        Exam exam = examBuilder.getExam();

        // Iterator pattern usage
        List<Colleague> stakeholders = new ArrayList<>();
        stakeholders.add(teacher);
        stakeholders.add(admin);

        ExamIterator iterator = new ExamStakeholdersIterator(stakeholders);
        while (iterator.hasNext()) {
            Colleague colleague = iterator.next();
            colleague.sendMessage("Important message");
        }

        // Template method pattern usage
        ExamTemplate onlineExam = new OnlineExam(true);
        onlineExam.takeExam();

        // Observer pattern usage
        Observer parent = new Parent("Parent1");
        RealTimeCommunication communication = new RealTimeCommunication();
        communication.addObserver(parent);
        communication.notifyObservers("Exam results are available");
    }
}
