package us.kapera.zad33;

import java.io.IOException;

/**
 * User: piotr
 * Date: 2010-03-07
 * Time: 14:51:14
 */
public class Converter {
  private int height = 0;
  public static final double INCH = 2.54;
  public static final double FEET = 30.48;

  public Converter(int heightInCm) throws IOException {
    if(heightInCm < 0) {
      throw new IOException("Wzrost nie może być ujemny");
    }
    this.height = heightInCm;
  }

  public double getInches() {
    return height / INCH;
  }

  public double getFeets() {
    return height / FEET;
  }
}
