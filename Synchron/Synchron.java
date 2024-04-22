package Synchron;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Synchron {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        // при использовании метода work на 2х потоках без их синхронизации, начнётся race condition (состояние гонки) и часть данных будет теряться
        // чтобы этого избежать, нужна синхронизация, но не на методах addToList1 и addToList2 (не на объекте this)
        // а на разных объектах (через Object lock1 и Object lock2) через synchronized-блок (и у объектов будет разный монитор)
        // без явной синхронизации у этих методов общий объект this - Worker и его монитор будет занят либо одним методом, либо другим
        // следовательно методы будт выполняться по-очереди (один выполняется, второй ждет), что увеличит время выполнения в 2 раза
        // а надо разрешить одновременное выполнение методов в разных потоках, за счет явной синхронизации
        // тк между потоками не происходит пересечения данных и это будет безопасно (в 1 методе изменяется list1, во 2 - list2)
        // теперь если один поток зашел в метод addToList1, то второй не будет ждать, а может зайти в addToList2
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        long after = System.currentTimeMillis();

        System.out.println("Program took " + (after - before) + " ms to run");

        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}*/

import HW13.Task2.src.processor.CountJ;

import java.util.LinkedList;
import java.util.Queue;

public class Synchron {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();
    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }

                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }

            Thread.sleep(1000);
        }
    }
}
