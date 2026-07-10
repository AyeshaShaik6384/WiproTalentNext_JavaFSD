package src.Abstraction.ExceptionHandling.program5;

import java.util.Scanner;

public class AgeValidator {

    public void validate(int age)
            throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                    "Age must be 18 or above");
        }

        System.out.println("Age is valid");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age : ");

        int age = sc.nextInt();

        AgeValidator obj = new AgeValidator();

        try {

            obj.validate(age);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}