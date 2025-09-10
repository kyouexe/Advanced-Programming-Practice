public class OddEvenThreads {
    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }
    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        }
    }
    public static void main(String[] args) {
        new OddThread().start();
        new EvenThread().start();
    }
}
