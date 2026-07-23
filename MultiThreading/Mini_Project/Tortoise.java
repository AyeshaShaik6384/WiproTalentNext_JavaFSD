package MultiThreading.Mini_Project;
class Tortoise extends Thread {

    public Tortoise() {
        setName("Tortoise");
    }

    public void run() {

        for (int i = 1; i <= 100 && !Hare.raceOver; i++) {

            System.out.println(getName() + " : " + i + " meters");

            if (i == 100) {
                Hare.raceOver = true;
                System.out.println("🏆 Tortoise Wins the Race");
            }
        }
    }
}
