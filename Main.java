public class Main {
    public static void main(String[] args) {
        Singleton mySingle = Singleton.getInstance();
        mySingle.printer();
        Singleton yourSingle = Singleton.getInstance();
        yourSingle.printer();
        System.out.println(mySingle == yourSingle);
    }
}