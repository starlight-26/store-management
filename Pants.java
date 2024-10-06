/*
 * Represents a pair of pants in a clothing store
 */
public class Pants extends Clothes {

  // Instance Variables
  private boolean isShort;   // Are the pants long or short

  // Constructor Methods
  /*
  * Sets the price to 20.99,
  * the size to "medium",
  * the color to "blue",
  * and the shortness to false
  */
  public Pants() {
    this(20.99, "Medium", "Blue", false);
  }

  /*
  * Sets the price, size, color, and shortness to a specified value
  */
  public Pants(double price, String size, String color, boolean isShort) {
    super(price, size, color);
    this.isShort = isShort;
  }

  // Accessor and Mutator Methods
  /*
  * Returns if the pants are shorts
  */
  public boolean getIsShort() {
    return isShort;
  }

  /*
  * Sets if the pants are short
  */
  public void setIsShort(boolean newIsShort) {
    isShort = newIsShort;
  }

  // Other

  // toString Method Override
  public String toString() {
    return super.toString() + "\nHas Design? " + isShort;
  }
  
}