import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    /*
     * Testing objects
     */
    // Creates a Clothes object with no arguments
    Clothes a = new Clothes();
    System.out.println("--------------------");
    // Prints out information about the a object
    System.out.println(a);
    // Creates a Clothes object with arguments
    Clothes b = new Clothes(5.99, "Small", "Black");
    System.out.println("--------------------");
    // Prints out information about the b object
    System.out.println(b);

    // Creates a Shirts object with no arguments
    Shirts c = new Shirts();
    System.out.println("--------------------");
    // Prints out information about the c object
    System.out.println(c);
    // Creates a Shirts object with arguments
    Shirts d = new Shirts(12.55, "Large", "Pink", true);
    System.out.println("--------------------");
    // Prints out information about the d object
    System.out.println(d);

    // Creates a Pants object with no arguments
    Pants e = new Pants();
    System.out.println("--------------------");
    // Prints out information about the e object
    System.out.println(e);
    // Creates a Pants object with arguments
    Pants f = new Pants(15.55, "Extra Small", "Purple", true);
    System.out.println("--------------------");
    // Prints out information about the f object
    System.out.println(f);


    /*
     * Getting user input
     */
    // Intro text
    System.out.println("Hi there! Welcome to Kristy's Clothing!");
    System.out.println("What would you like to buy?");
    System.out.println("1. Shirt");
    System.out.println("2. Pants");
    // Gets user selection
    int item = input.nextInt();
    if (item == 1 || item == 2) {
      // Gets the size of the object
      System.out.println("What size are you looking for?");
      System.out.println("1. Small");
      System.out.println("2. Medium");
      System.out.println("3. Large");
      int size = input.nextInt();
      String sizeing = "Medium";
      if (size == 1) {
        sizeing = "Small";
      } else if (size == 2) {
        sizeing = "Medium";
      } else if (size == 3) {
        sizeing = "Large";
      } 
      // Gets the color of the object
      System.out.println("What color do you want it to be?");
      String color = input.next();
      if (item == 1) {
        // Has the user decide if they want a design
        System.out.println("Do you want the shirt to have a design?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int placeholder = input.nextInt();
        boolean design = false;
        if (placeholder == 1) {
          design = true;
        } 
        // Creates a Shirts object using the inputed variables
        Shirts customer = new Shirts(10.99, sizeing, color, design);
        System.out.println("--------------------");
        // Prints out infotmation about the Shirts object
        System.out.println(customer);
      } else if (item == 2) {
        // Has the user decide if they want the pants to be short
        System.out.println("Do you want the pants to be short?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int placeholder = input.nextInt();
        boolean isShort = false;
        if (placeholder == 1) {
          isShort = true;
        } 
        // Creates a Pants object using the inputed variables
        Pants customer = new Pants(15.99, sizeing, color, isShort);
        System.out.println("--------------------");
        // Prints out infotmation about the Pants object
        System.out.println(customer);
      }
    } else {
      // Prints out an error message if the user doesn't make an acceptable selection
      System.out.println("Im sorry, we don't carry that item.");
    }
    // Ending message
    System.out.println("Thank you! Come back soon!");



    // Closes the Scanner object
    input.close();
    
  }
}