// Jaquwonne Johnson-Quinones
// Import libraries here

import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    // Part 1
    System.out.println("    JJJJJJJJJJJJJJJ   JJJJJJJJJJJJJJJ  ");
    System.out.println("          JJJJ              JJJJ   ");
    System.out.println("          JJJJ              JJJJ   ");
    System.out.println("          JJJJ              JJJJ   ");
    System.out.println("    JJJJ  JJJ         JJJJ  JJJ    ");
    System.out.println("      JJJJJJ            JJJJJJ  ");
    System.out.println(" ");

    // Part 2
    Scanner scan = new Scanner(System.in);

    String message1;
    System.out.println("Enter a 5-character string... ");
    message1 = scan.nextLine();

    String secondletter = message1.substring(1, 2);
    String thirdletter = message1.substring(2, 3);
    String fourthletter = message1.substring(3, 4);

    String message2 = fourthletter + thirdletter + secondletter;

    // Part 3
    float temp, celsius;

    System.out.print("Enter the temperture in Fahrenheit... ");
    temp = scan.nextInt();

    celsius = (temp - 32) * 5/9;

    System.out.println("Your temperture in Celsius is... " + celsius);



    // Part 4
    Random rand = new Random();
    int MAX = 16384;

    int random = rand.nextInt(MAX);

    System.out.println("Random number generated. Continuing...");
    System.out.println(celsius+message2+random);

scan.close();
  }
}
