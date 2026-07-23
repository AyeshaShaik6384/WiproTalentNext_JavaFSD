package MultiThreading.Mini_Project;

class Hare extends Thread {

    static boolean raceOver = false;

    public Hare() {
        setName("Hare");
    }

    public void run() {

        for (int i = 1; i <= 100 && !raceOver; i++) {

            System.out.println(getName() + " : " + i + " meters");

            if (i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }

            if (i == 100) {
                raceOver = true;
                System.out.println("🏆 Hare Wins the Race");
            }
        }
    }
}