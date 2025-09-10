public class SquaresRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * i);
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new SquaresRunnable());
        t.start();
    }
}
