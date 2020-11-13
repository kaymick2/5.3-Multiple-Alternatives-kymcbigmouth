import java.util.Scanner;

/**
 * This program prints a description of an earthquake of a given magnitude.
 */
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a magnitude on the Richter scale: ");
    double magnitude = in.nextDouble();
    Earthquake quake = new Earthquake(magnitude);
    System.out.println(quake.getDescription());
    
    /**
     * tax program. it does tax return stuff.
     */

    Scanner in2 = new Scanner(System.in);

    System.out.print("Please enter your income: ");
    double income = in2.nextDouble();

    System.out.print("Are you married? (Y/N) ");
    String input = in2.next();
    int status;
    if (input.equalsIgnoreCase("Y"))
      status = TaxReturn.MARRIED;
    else
      status = TaxReturn.SINGLE;

    TaxReturn aTaxReturn = new TaxReturn(income, status);

    System.out.println("Tax: " + aTaxReturn.getTax());
  }
}
