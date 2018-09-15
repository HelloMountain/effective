package multithreading;

public class MyThread extends Thread {

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();

        // for(int i = 0;i<10;i++){
        // System.out.println("main：" + i);
        // }
    }
}
