/**
 * A class that describes the effects of an earthquake.
 */
public class Earthquake {
  private double richter;

  /**
   * Constructs an Earthquake object.
   * 
   * @param magnitude the magnitude on the Richter scale
   */
  public Earthquake(double magnitude) {
    richter = magnitude;
  }

  /**
   * Gets a description of the effect of the earthquake.
   * 
   * @return the description of the effect
   */
  String r;

  public String getDescription() {

    if (richter >= 8.0) // didn't use else
      r = "Most structures fall";
    if (richter >= 7.0)
      r = "Many buildings destroyed";
    if (richter >= 6.0)
      r = "Many buildings considerab1y damaged, some collapse";
    if (richter >= 4.5)
      r = "Damage to poorly constructed buildings";
    if (richter >= 3.5)
      r = "Felt by many people, no destruction";
    if (richter >= 0)
      r = "Generally not felt by people";
    return r;

  }
}
