package Wrapper_Classes.program3;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");

        int n = sc.nextInt();

        if (n < 1 || n > 255) {
            System.out.println("Number should be between 1 and 255.");
            sc.close();
            return;
        }

        String binary = Integer.toBinaryString(n);

        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(binary);

        sc.close();
    }
}
