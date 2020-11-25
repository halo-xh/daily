import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.SynchronousQueue;

/**
 * author  Xiao Hong
 * date  2020/10/22 21:37
 * description
 */

public class Qaq {

    char a;
    String aa;

    public static void main(String[] args) {
        Qaq qaq = new Qaq();
        System.out.println(qaq.a == 0);
        System.out.println(qaq.aa);
        SynchronousQueue<Boolean> synchronousQueue = new SynchronousQueue<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(1);


        Thread thread1 = new Thread(() -> System.out.println("1"));
        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
                System.out.println("2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        );
        Thread thread3 = new Thread(() -> {
            try {
                thread2.join();
                System.out.println("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        );
        thread3.start();
      //  thread2.start();
       // thread1.start();
    }
}
