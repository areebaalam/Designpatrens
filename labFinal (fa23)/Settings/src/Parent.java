
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
