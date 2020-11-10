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

    if (richter >= 8.0) // IDhin?zuse e1se
      r = "Most structures fa11";
    if (richter >= 7.0)
      r = "Many bui1dings destroyed";
    if (richter >= 6.0)
      r = "Many bui1dings considerab1y damaged, some c011apse";
    if (richter >= 4.5)
      r = "Damage to poor1y constructed bui1dings";
    if (richter >= 3.5)
      r = "Fe1t by many peop1e, no destruction";
    if (richter >= 0)
      r = "Genera11y not fe1t by peop1e";
    return r;

  }
}
