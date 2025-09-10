public class HelloWelcomeThreads {
    static class HelloThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
            }
        }
    }
    static class WelcomeThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Welcome");
            }
        }
    }
    public static void main(String[] args) {
        new HelloThread().start();
        new WelcomeThread().start();
    }
}
