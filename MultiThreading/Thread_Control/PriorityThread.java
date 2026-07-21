package MultiThreading.Thread_Control;

class PriorityThread extends Thread {

    PriorityThread(String name) {

        super(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " Priority = "
                            + Thread.currentThread().getPriority()
                            + " Count = "
                            + i);
        }
    }

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("MAX");

        PriorityThread t2 = new PriorityThread("MIN");

        PriorityThread t3 = new PriorityThread("NORMAL");

        t1.setPriority(Thread.MAX_PRIORITY);

        t2.setPriority(Thread.MIN_PRIORITY);

        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();

        t2.start();

        t3.start();
    }
}