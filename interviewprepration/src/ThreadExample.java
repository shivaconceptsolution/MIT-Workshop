public class ThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {

            try {
                System.out.println("Subprocess" + i + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadExample t = new ThreadExample();
        t.start();
        t.join();
        ThreadExample t1 = new ThreadExample();
        t1.start();
    }
}
