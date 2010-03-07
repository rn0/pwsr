package us.kapera.zad33;

import java.io.IOException;
import java.util.Scanner;

/**
 * User: piotr
 * Date: 2010-03-07
 * Time: 14:49:45
 */
public class zad33 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Podaj wzrost w centymetrach: ");
    int height = sc.nextInt();
    try {
      Converter converter = new Converter(height);
      System.out.printf(" * Wzrost w calach:  %10.2f\n", converter.getInches());
      System.out.printf(" * Wzrost w stopach: %10.2f\n", converter.getFeets());
    }
    catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
