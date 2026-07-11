package IOOperations.program1;

import java.io.File;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter the file name: ");
            String fileName = sc.nextLine();

            System.out.print("Enter the character to be counted: ");
            char ch = Character.toLowerCase(sc.next().charAt(0));

            Scanner file = new Scanner(new File(fileName));

            int count = 0;

            while (file.hasNextLine()) {

                String line = file.nextLine().toLowerCase();

                for (int i = 0; i < line.length(); i++) {

                    if (line.charAt(i) == ch)
                        count++;
                }
            }

            file.close();

            System.out.println("File '" + fileName + "' has " + count +
                    " instances of letter '" + ch + "'.");

        } catch (Exception e) {

            System.out.println(e);
        }

        sc.close();
    }
}