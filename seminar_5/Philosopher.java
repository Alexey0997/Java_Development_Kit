package ru.geekbrains.test;


public class Philosopher implements Runnable {
    private int eating = 3;
    private final Fork leftFork;
    private final Fork rightFork;
    private final String name;
    private final long timeout;

    public Philosopher(Fork leftFork, Fork rightFork, String name) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.name = name;
        timeout = System.nanoTime();
    }


    @Override
    public void run() {
        int count = 0;
        while (eating > 0) {
            try {
                activity("думает", 3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (rightFork) {
                synchronized (leftFork) {
                    try {
                        activity("взял вилки " + leftFork.amount + " и " + rightFork.amount, 500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        activity("кушает ", 2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    eating--;
                    count++;
                    try {
                        activity("положил вилки " + leftFork.amount + " и " + rightFork.amount, 500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        activity("покушал " + count + " раза и наелся.\n" );
    }



//
//    @Override
//    public void run() {
//        while (eating > 0) {
//            try {
//                activity("думает", 3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            synchronized (rightFork) {
//                try {
//                    activity("взял вилку " + rightFork.amount, 500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                synchronized (leftFork) {
//                    try {
//                        activity("взял вилку " + leftFork.amount, 500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    try {
//                        activity("кушает ", 2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    eating--;
//                    try {
//                        activity("положил вилку " + leftFork.amount, 500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                try {
//                    activity("положил вилку " + rightFork.amount, 500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        activity("философ сыт");
//    }

    private void activity(String act, long timeout) throws InterruptedException {
        activity(act);
        Thread.sleep((int) (Math.random() * timeout));

    }

    private void activity(String act) {
        long time = (System.nanoTime() - timeout) / 10_000_000;
        System.out.printf("%s философ %s - %s\n", time, name, act);

    }
}
