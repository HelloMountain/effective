package jvm;

/**
 * @Classname DeadLoopClass
 * @Description TODO
 * @Date 2018/10/15 10:03
 * @Created by HP
 */
public class DeadLoopClass {
    static {
        if (true){
            System.out.println(Thread.currentThread() + "init DeadLoopClass");
            while (true){}
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "init");
                DeadLoopClass deadLoopClass = new DeadLoopClass();
                System.out.println(Thread.currentThread() + "over");
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
