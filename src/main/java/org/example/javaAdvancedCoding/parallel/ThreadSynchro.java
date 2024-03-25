package org.example.javaAdvancedCoding.parallel;

public class ThreadSynchro {
    public static void main(String[] args) {
        final Pair pair = new Pair(0, 0);
        DummyPairIncrementer dummyPairIncrementer = new DummyPairIncrementer(pair);
        new Thread(dummyPairIncrementer).start();
        new Thread(dummyPairIncrementer).start();
        new Thread(dummyPairIncrementer).start();

//        int[] a= new int[]{0};
//
//        new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                a[0]++;
//            }
//            System.out.println(a[0]);
//        }).start();
//        new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                a[0]++;
//            }
//            System.out.println(a[0]);
//        }).start();
    }
}

class Pair {
    private Integer left;
    private Integer right;

    public Pair(final Integer left, final Integer right) {
        this.left = left;
        this.right = right;
    }

    public void incrementLeft() {
        left++;
    }

    public void incrementRight() {
        right++;
    }

    public Integer getLeft() {
        return left;
    }

    public Integer getRight() {
        return right;
    }
}

class DummyPairIncrementer implements Runnable {
    private final Pair pair;

    public DummyPairIncrementer(final Pair pair) {
        this.pair = pair;
    }

    private synchronized void incrementInternal() {
        pair.incrementLeft();
        pair.incrementRight();
    }

    @Override
    public void run() {

        for (int idx = 0; idx < 100; idx++) {
            //synchronized method
            incrementInternal();

            //if we have no method, we can synchronize block
//            synchronized (pair) { //while(pair.isLocked){};
//                                  //pair.lock();
//                pair.incrementLeft();
//                pair.incrementRight();
//            }
            //pair.unlock()
        }
        System.out.println(pair.getLeft() + " " + pair.getRight());
    }
    //1. l1 2.l2 r1 2.l3 r2 1.r3
}
