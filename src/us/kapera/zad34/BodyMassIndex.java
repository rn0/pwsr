package us.kapera.zad34;

/**
 * User: piotr
 * Date: 2010-03-07
 * Time: 15:31:52
 */
public class BodyMassIndex {
  private double weight;
  private double height;
  private double bmi;
  private BodyMassIndexDescription description;

  public BodyMassIndex(double weight, double height) {
    this.weight = weight;
    this.height = height;
    bmi = calculate();
    description = new BodyMassIndexDescription();
  }

  private double calculate() {
    return weight / Math.pow(height, 2);
  }

  public double getBmi() {
    return bmi;
  }

  public String getDescription() {
    // FIXIT:
    return description.getRange(bmi).getDescription();
  }
}
