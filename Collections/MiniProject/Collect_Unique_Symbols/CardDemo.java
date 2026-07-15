package Collections.MiniProject.Collect_Unique_Symbols;

import java.util.*;

public class CardDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Character, Card> map = new TreeMap<>();

        int count = 0;

        while (map.size() < 4) {

            System.out.println("Enter a card :");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            count++;

            if (!map.containsKey(symbol)) {
                map.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        for (Card c : map.values()) {
            System.out.println(c);
        }

        sc.close();
    }
}