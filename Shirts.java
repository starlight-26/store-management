/*
 * Represents a shirt in a clothing store
 */
public class Shirts extends Clothes {

  // Instance Variables
  private boolean hasDesign;   // Does the shirt have a design on it

  // Constructor Methods
  /*
  * Sets the price to 5.99,
  * the size to "medium",
  * the color to "grey",
  * and the hasDesign to false
  */
  public Shirts() {
    this(5.99, "Medium", "Grey", false);
  }

  /*
  * Sets the price, size, color, and design to a specified value
  */
  public Shirts(double price, String size, String color, boolean hasDesign) {
    super(price, size, color);
    this.hasDesign = hasDesign;
  }

  // Accessor and Mutator Methods
  /*
  * Returns if the shirt has a design or not
  */
  public boolean getHasDesign() {
    return hasDesign;
  }

  /*
  * Sets if the shirt has a design
  */
  public void setHasDesign(boolean newDesign) {
    hasDesign = newDesign;
  }

  // Other

  // toString Method Override
  public String toString() {
    return super.toString() + "\nHas Design? " + hasDesign;
  }
  
}