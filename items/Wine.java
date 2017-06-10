package items;
import interfaces.*;

public class Wine extends Item implements Drinkable{
  public Wine(String name, int price) {
    super(name, price);
  }
  public String drink() {
    return "Getting drunk";
  }

}