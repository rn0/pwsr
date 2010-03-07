package us.kapera.zad34;

public class BodyMassIndexDescription {
  public class BMIRangeDescription {
    private double low;
    private double high;
    private String description;

    public BMIRangeDescription(double low, double high, String description) {
      this.low = low;
      this.high = high;
      this.description = description;
    }

    public Boolean matches(double bmi) {
      return (bmi >= low && bmi <= high);
    }

    public String getDescription() {
      return description;
    }
  }

  // Źródło: http://pl.wikipedia.org/wiki/Body_Mass_Index
  private BMIRangeDescription[] ranges = {
    new BMIRangeDescription(0, 16., "wygłodzenie"),
    new BMIRangeDescription(16., 16.99, "wychudzenie (spowodowane często przez ciężką chorobę lub anoreksję)"),
    new BMIRangeDescription(17., 18.49, "niedowagę"),
    new BMIRangeDescription(18.5, 24.99, "wartość prawidłową"),
    new BMIRangeDescription(25., 29.99, "nadwagę"),
    new BMIRangeDescription(30., 34.99, "I stopień otyłości"),
    new BMIRangeDescription(35., 39.99, "II stopień otyłości"),
    new BMIRangeDescription(40.0, 99., "III stopień otyłości (otyłość skrajna)"),
  };

  public BMIRangeDescription getRange(double bmi) {
    for (BMIRangeDescription range : ranges) {
      if (range.matches(bmi)) {
        return range;
      }
    }
    return null;
  }
}