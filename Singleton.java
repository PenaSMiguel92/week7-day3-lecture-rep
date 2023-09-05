public class Singleton {
    private static Singleton instance;
    private int number;

    private Singleton() {
        number = 0;
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

    public void printer() {
        this.number++;
        System.out.println("printer has been called " + this.number + " times.");
    }
}
