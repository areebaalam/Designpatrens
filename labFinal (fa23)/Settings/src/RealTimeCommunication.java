
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

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
