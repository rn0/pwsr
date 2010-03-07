package us.kapera.zad34;

import java.util.Scanner;

/**
 * User: piotr
 * Date: 2010-03-07
 * Time: 15:30:28
 */
public class zad34 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Podaj wzrost w metrach: ");
      double height = sc.nextDouble();
      System.out.print("Podaj wagę w kilogramach: ");
      double weight = sc.nextDouble();

      BodyMassIndex bmi = new BodyMassIndex(weight, height);
      System.out.println("BMI: " + bmi.getBmi());
      System.out.println("Opis: " + bmi.getDescription());
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
