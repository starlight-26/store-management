/*
 * Represents a clothing item that is sold at the store
 */
public class Clothes extends StoreRunner {

  // Instance Variables
  private double price;   // The price of the item
  private String size;    // The size of the item
  private String color;   // The color of the item

  // Constructor Methods
  /*
  * Sets the price to 10.99,
  * the size to "medium",
  * and the color to "white"
  */
  public Clothes() {
    this(10.99, "Medium", "White");
  }

  /*
  * Sets the price, size, and color to a specified value
  */
  public Clothes(double price, String size, String color) {
    this.price = price;
    this.size = size;
    this.color = color;
  }

  // Accessor and Mutator Methods
  /*
  * Returns the price of the item
  */
  public double getPrice() {
    return price;
  }

  /*
  * Sets the price of the item to newPrice
  */
  public void setPrice(double newPrice) {
    price = newPrice;
  }

  /*
  * Returns the size of the item
  */
  public String getSize() {
    return size;
  }

  /*
  * Sets the size of the item to newSize
  */
  public void setSize(String newSize) {
    size = newSize;
  }

  /*
  * Returns the color of the item
  */
  public String getColor() {
    return color;
  }

  /*
  * Sets the color of the item to newColor
  */
  public void setColor(String newColor) {
    color = newColor;
  }

  // Other

  // toString Method Override
  public String toString() {
    return "Price: " + price + "\nSize: " + size + "\nColor: " + color;
  }
  
}