package bot;

import java.util.Scanner;

public class SimpleBot {
    private static Scanner scanner;

    public static void main(String[] args) {
        opening(); //Start program
        scanner = new Scanner(System.in);
        System.out.println("What a great name you have, " + sayYouName() + "!");
        System.out.println("Your age is " + iKnowAge() + ": that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        countingWithExclamationMark(scanner.nextInt());
        testWhatYouRemember();
    }

    private static void opening() {
        System.out.println("Hello! My name is Aid.\n" +
                "I was created in 2019.");
    }

    private static String sayYouName() {
        System.out.println("Please, remind me your name.");
        return scanner.nextLine();
    }

    private static int iKnowAge() {
        System.out.println("Let me guess your age.\n" +
                "Say me remainders of dividing your age by 3, 5 and 7.");
        int[] intArray = new int[3];
        for(int i = 0; i < 3; i++)
        {
            intArray[i] = scanner.nextInt();
        }
        return ((intArray[0] % 3) * 70 + (intArray[1] % 5) * 21 + (intArray[2] % 7) * 15) % 105;
    }

    private static void countingWithExclamationMark(int count) {
        for (int i = 0; i <= count; ++i) {
            System.out.println(i + "!");
        }
    }

    private static void testWhatYouRemember() {
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        while (true) {
            if (scanner.nextInt() == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }
}
