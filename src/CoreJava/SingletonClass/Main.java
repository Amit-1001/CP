package CoreJava.SingletonClass;



public class Main {
    public static void main(String[] args) {
        // Getting the single instance of Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}