package MultiThreading.Thread_Creation;

import java.util.Random;

public class ColourRunnable implements Runnable {

    public void run() {

        String colours[] = {
                "white",
                "blue",
                "black",
                "green",
                "red",
                "yellow"
        };

        Random r = new Random();

        while (true) {

            int index = r.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red"))
                break;
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread(new ColourRunnable());

        t.start();
    }
}