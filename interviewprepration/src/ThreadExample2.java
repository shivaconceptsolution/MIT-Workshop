public class ThreadExample2 extends IMP implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {

            try {
                System.out.println("Subprocess" + i + Thread.currentThread().getName() + super.display());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        ThreadExample2 obj= new ThreadExample2();
        Thread thread = new Thread(obj);
        thread.start();

    }
}
