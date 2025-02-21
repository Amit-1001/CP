package CoreJava.SingletonClass;

public class Singleton {
    // Step 1: Create a static instance of the class
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Step 3: Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("This is a Singleton class!");
    }
}
