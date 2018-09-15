package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable{
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        return null;
    }

    public static void main(String[] args) {
//        Callable callable = new Callable() {
//            @Override
//            public Object call() throws Exception {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                }
//                return null;
//            }
//        };
        MyCallable callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
    }
}
